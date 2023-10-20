package com.example.demo.dl.domain;

import java.time.LocalDate;

public class GoalEntity {
    private Long goalId;
    private String name;
    private double targetAmount;
    private double currentAmount;
    private LocalDate targetDate;
    private boolean achieved;

    public Long getGoalId() {
        return goalId;
    }

    public void setGoalId(Long goalId) {
        this.goalId = goalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public void setAsAchieved(boolean achieved) {
        this.achieved = true;
    }
}