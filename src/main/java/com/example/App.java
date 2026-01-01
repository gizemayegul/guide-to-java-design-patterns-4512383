package com.example;

public class App {

    public static void main(String[] args) {

        var india = new Country("India", 10000000);
        var poland = new Country("Poland", 200000);
        var nigeria = new Country("Nigeria", 3000000);
        var canada = new Country("Canada", 400000);
        var argentina = new Country("Argentina", 500000);

        var countriesInventory = new CountriesInventory(new Country[] {
                india, poland, nigeria, canada, argentina
        });

        var iterator = countriesInventory.iterator();
        while (iterator.hasNext()) {
            var country = iterator.next();
            System.out.println("Country: " + country.getName());
        }

    }

}
