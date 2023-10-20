package com.example.demo.dl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CategoryEntity {
    @Id
    private Long categoryId;
    private String categoryName;
    private String description;
    private Long budgetAllocation;
    private Long monthlyAverage;

    public CategoryEntity(Long categoryId, String categoryName, String description, Long budgetAllocation, Long monthlyAverage) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.budgetAllocation = budgetAllocation;
        this.monthlyAverage = monthlyAverage;
    }

    public CategoryEntity() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBudgetAllocation() {
        return budgetAllocation;
    }

    public void setBudgetAllocation(Long budgetAllocation) {
        this.budgetAllocation = budgetAllocation;
    }

    public Long getMonthlyAverage() {
        return monthlyAverage;
    }

    public void setMonthlyAverage(Long monthlyAverage) {
        this.monthlyAverage = monthlyAverage;
    }
}