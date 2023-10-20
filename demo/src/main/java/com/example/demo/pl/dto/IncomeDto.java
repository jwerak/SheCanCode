package com.example.demo.pl.dto;

import java.time.LocalDate;

public class IncomeDto {
    private Long incomeId;
    private LocalDate date;
    private Long amount;
    private String description;

    public IncomeDto(Long incomeId, LocalDate date, Long amount, String description) {
        this.incomeId = incomeId;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public Long getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Long incomeId) {
        this.incomeId = incomeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
