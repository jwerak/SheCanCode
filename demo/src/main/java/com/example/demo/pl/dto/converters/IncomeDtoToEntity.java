package com.example.demo.pl.dto.converters;

import com.example.demo.dl.domain.IncomeEntity;
import com.example.demo.pl.dto.IncomeDto;

import java.util.function.Function;

public class IncomeDtoToEntity implements Function<IncomeDto, IncomeEntity> {

    @Override
    public IncomeEntity apply(IncomeDto incomeDto) {
        IncomeEntity income = new IncomeEntity();
        income.setIncomeId(incomeDto.getIncomeId());
        income.setDate(incomeDto.getDate());
        income.setAmount(incomeDto.getAmount());
        income.setDescription(incomeDto.getDescription());
        return income;
    }
}
