package com.example.demo.pl.dto.converters;

import com.example.demo.dl.domain.IncomeEntity;
import com.example.demo.pl.dto.IncomeDto;
import java.util.function.Function;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class IncomeEntityToDto implements Function<IncomeEntity, IncomeDto> {

    @Override
    public IncomeDto apply (IncomeEntity income) {
        return new IncomeDto(income.getIncomeId(), income.getDate(), income.getAmount(), income.getDescription());
    }

}
