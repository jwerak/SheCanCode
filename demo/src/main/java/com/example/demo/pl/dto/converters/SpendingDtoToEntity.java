package com.example.demo.pl.dto.converters;

import com.example.demo.dl.domain.SpendingEntity;
import com.example.demo.pl.dto.SpendingDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class SpendingDtoToEntity implements Function<SpendingDto, SpendingEntity> {
    @Override
    public SpendingEntity apply(SpendingDto spendingDto) {
        SpendingEntity spending = new SpendingEntity();
        spending.setTransactionId(spendingDto.getTransactionId());
        spending.setDate(spendingDto.getDate());
        spending.setAmount(spending.getAmount());
        spending.setDescription(spending.getDescription());
        return spending;
    }
}
