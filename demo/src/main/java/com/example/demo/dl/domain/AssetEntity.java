package com.example.demo.dl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class AssetEntity {
    @Id
    private Long assetId;
    private String assetName;
    private String assetType;
    private Long riskLevel;
    private String description;
    private Long assetPrice;

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Long getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(Long assetPrice) {
        this.assetPrice = assetPrice;
    }
}
