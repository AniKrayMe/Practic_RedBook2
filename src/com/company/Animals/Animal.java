package com.company.Animals;

import com.company.RiskLevel;

public abstract class Animal {
    //region Properties
    public RiskLevel riskLevel;

    //endregion
    //region Constructor

    public Animal(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    //endregion
    //region Getter and Setter

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    //endregion
    //region equals hashCode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return riskLevel == animal.riskLevel;
    }

    @Override
    public int hashCode() {
        return riskLevel != null ? riskLevel.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "riskLevel=" + riskLevel +
                '}';
    }
     //endregion

    }
