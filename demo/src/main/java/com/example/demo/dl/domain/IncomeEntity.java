package com.example.demo.dl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class IncomeEntity {
    @Id
    private Long incomeId;
    private LocalDate date;
    private Long amount;
    private String description;

    public IncomeEntity(Long incomeId, LocalDate date, Long amount, String description) {
        this.incomeId = incomeId;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public IncomeEntity() {
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
