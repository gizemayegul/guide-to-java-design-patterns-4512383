package com.example;

import java.util.Iterator;

public class CountriesInventory implements Iterable<Country> {

  private final Country[] countries;

  public CountriesInventory(Country[] countries) {
    this.countries = countries;
  }

  @Override
  public Iterator<Country> iterator() {
    return new CountriesInventoryIterator(countries);
  }

}