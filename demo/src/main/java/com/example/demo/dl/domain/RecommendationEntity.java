package com.example.demo.dl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RecommendationEntity {
    @Id
    private Long recommendationId;
    private String title;
    private String description;
    private UserEntity user;
    private GoalEntity Goal;

    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public GoalEntity getGoal() {
        return Goal;
    }

    public void setGoal(GoalEntity goal) {
        Goal = goal;
    }
}