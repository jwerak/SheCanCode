package com.example.demo.pl.api;

import com.example.demo.bl.service.CrudService;
import com.example.demo.dl.domain.SpendingEntity;
import com.example.demo.pl.dto.SpendingDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/spending")
public class SpendingController extends CrudRestController<SpendingEntity, SpendingDto, Long> {
    /**
     * Initialize the CRUD controller with the CRUD service and the entity-DTO converters.
     *
     * @param service                           the CRUD service
     * @param spendingEntitySpendingDtoFunction the entity-DTO converter
     * @param spendingDtoSpendingEntityFunction the DTO-entity converter
     */
    protected SpendingController(CrudService<SpendingEntity, Long> service, Function<SpendingEntity, SpendingDto> spendingEntitySpendingDtoFunction, Function<SpendingDto, SpendingEntity> spendingDtoSpendingEntityFunction) {
        super(service, spendingEntitySpendingDtoFunction, spendingDtoSpendingEntityFunction);
    }
}
