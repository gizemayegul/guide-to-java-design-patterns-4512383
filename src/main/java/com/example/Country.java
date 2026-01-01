package com.example;

public class Country {

    private final String name;
    private final int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public int getPopulation() {
        return this.population;
    }

}
