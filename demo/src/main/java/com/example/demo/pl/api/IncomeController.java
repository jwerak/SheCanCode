package com.example.demo.pl.api;

import com.example.demo.bl.service.CrudService;
import com.example.demo.dl.domain.IncomeEntity;
import com.example.demo.pl.dto.IncomeDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/income")
public class IncomeController extends CrudRestController<IncomeEntity, IncomeDto,Long> {
    /**
     * Initialize the CRUD controller with the CRUD service and the entity-DTO converters.
     *
     * @param service                       the CRUD service
     * @param incomeEntityIncomeDtoFunction the entity-DTO converter
     * @param incomeDtoIncomeEntityFunction the DTO-entity converter
     */
    protected IncomeController(CrudService<IncomeEntity, Long> service, Function<IncomeEntity, IncomeDto> incomeEntityIncomeDtoFunction, Function<IncomeDto, IncomeEntity> incomeDtoIncomeEntityFunction) {
        super(service, incomeEntityIncomeDtoFunction, incomeDtoIncomeEntityFunction);
    }
}
