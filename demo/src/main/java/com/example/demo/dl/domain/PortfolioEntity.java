package com.example.demo.dl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.util.List;

@Entity
public class PortfolioEntity {
    @Id
    private Long portfolioId;

    @OneToOne
    private UserEntity user;
    private String portfolioName;
    private LocalDate creationDate;
    private LocalDate updatedDate;

    @OneToMany
    private List<AssetEntity> assets;
    private Long totalPortfolioValue;
    // add transaction history?
    private String status;

    public PortfolioEntity(Long portfolioId, UserEntity user, String portfolioName, LocalDate creationDate, LocalDate updatedDate, List<AssetEntity> assets, Long totalPortfolioValue, String status) {
        this.portfolioId = portfolioId;
        this.user = user;
        this.portfolioName = portfolioName;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
        this.assets = assets;
        this.totalPortfolioValue = totalPortfolioValue;
        this.status = status;
    }

    public PortfolioEntity() {
    }

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
