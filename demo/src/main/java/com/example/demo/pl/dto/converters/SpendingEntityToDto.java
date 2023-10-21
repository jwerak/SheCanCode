package com.example.demo.pl.dto.converters;

import com.example.demo.dl.domain.SpendingEntity;
import com.example.demo.pl.dto.SpendingDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class SpendingEntityToDto implements Function<SpendingEntity, SpendingDto> {
    @Override
    public SpendingDto apply(SpendingEntity spendingEntity) {
        return new SpendingDto(spendingEntity.getTransactionId(), spendingEntity.getDate(), spendingEntity.getDescription(),
                spendingEntity.getAmount());
    }
}
