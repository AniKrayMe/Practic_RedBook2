package com.company;


import com.company.Animals.Animal;

import java.util.ArrayList;

public class RedBook {


    //region Properties
    private ArrayList<Animal> animals;
    //endregion

    //region Constructor

    public RedBook(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public RedBook() {
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    //endregion

    //region equals hashCode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RedBook redBook = (RedBook) o;

        return animals != null ? animals.equals( redBook.animals ) : redBook.animals == null;
    }

    @Override
    public int hashCode() {
        return animals != null ? animals.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RedBook{" +
                "animals=" + animals +
                '}';
    }
    //endregion


    public  ArrayList<Animal> getAnimalsByRiskLevel(RiskLevel riskLevel) {
        for (int i = 0; i <; i++) {

        }

    }


}

