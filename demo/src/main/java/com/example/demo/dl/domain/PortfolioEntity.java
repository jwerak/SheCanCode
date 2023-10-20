package com.example.demo.dl.domain;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Entity
public class PortfolioEntity {
    private Long portfolioId;
    private UserEntity user;
    private String portfolioName;
    private LocalDate creationDate;
    private LocalDate updatedDate;
    private List<AssetEntity> assets;
    private Long totalPortfolioValue;
    // add transaction history?
    private String status;

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<AssetEntity> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetEntity> assets) {
        this.assets = assets;
    }

    public Long getTotalPortfolioValue() {
        return totalPortfolioValue;
    }

    public void setTotalPortfolioValue(Long totalPortfolioValue) {
        this.totalPortfolioValue = totalPortfolioValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
