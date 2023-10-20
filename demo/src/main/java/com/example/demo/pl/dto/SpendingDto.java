package com.example.demo.pl.dto;

import java.time.LocalDate;

public class SpendingDto {
    private Long transactionId;
    private LocalDate date;
    private String description;
    private Long amount;

    public SpendingDto(Long transactionId, LocalDate date, String description, Long amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
