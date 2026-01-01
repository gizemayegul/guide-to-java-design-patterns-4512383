package com.example;

import java.util.Iterator;

public class CountriesInventoryIterator implements Iterator<Country> {

  private final Country[] countries;
  private int index;

  public CountriesInventoryIterator(Country[] countries) {
    this.countries = countries;
  }

  @Override
  public boolean hasNext() {
    return index < countries.length;
  }

  @Override
  public Country next() {
    if (hasNext()) {
      var country = countries[index++];
      if (country.getPopulation() > 2000000) {
        return country;
      } else {
        return next();
      }
    } else {
      return null;
    }
  }

}
