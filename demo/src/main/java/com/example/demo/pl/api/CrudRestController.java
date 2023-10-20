package com.example.demo.pl.api;

import com.example.demo.bl.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@CrossOrigin(
        origins = "*",
        allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE}, maxAge = 3600)
public abstract class CrudRestController<Entity, Dto, ID> {
    protected CrudService<Entity, ID> service;
    protected Function<Entity, Dto> entityDtoFunction;
    protected Function<Dto, Entity> dtoEntityFunction;

    /**
     * Initialize the CRUD controller with the CRUD service and the entity-DTO converters.
     *
     * @param service           the CRUD service
     * @param entityDtoFunction the entity-DTO converter
     * @param dtoEntityFunction the DTO-entity converter
     */
    protected CrudRestController(CrudService<Entity, ID> service, Function<Entity, Dto> entityDtoFunction, Function<Dto, Entity> dtoEntityFunction) {
        this.service = service;
        this.entityDtoFunction = entityDtoFunction;
        this.dtoEntityFunction = dtoEntityFunction;
    }

    /**
     * Create a new entity.
     *
     * @param e the DTO
     * @return the created entity
     * @throws ResponseStatusException if the entity already exists
     */
    @PostMapping
    @ResponseBody
    public Dto create(@RequestBody Dto e) {
        try {
            return entityDtoFunction.apply(service.create(dtoEntityFunction.apply(e)));
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Read an entity by its ID.
     *
     * @param id the ID
     * @return the entity
     * @throws ResponseStatusException if the entity does not exist
     */
    @GetMapping("/{id}")
    public Dto readById(@PathVariable ID id) {
        return entityDtoFunction.apply(service.readById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    /**
     * Read all entities.
     *
     * @return all entities
     */
    @GetMapping
    public Iterable<Dto> readAll() {
        return StreamSupport.stream(service.read().spliterator(), false).map(entityDtoFunction).collect(Collectors.toList());
    }

    /**
     * Delete an entity by its ID.
     *
     * @param id the ID
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        service.deleteById(id);
    }

    /**
     * Update an entity.
     *
     * @param e  the DTO
     * @param id the ID
     */
    @PutMapping("/{id}")
    public void update(@RequestBody Dto e, @PathVariable ID id) {
        service.update(id, dtoEntityFunction.apply(e));
    }

}

