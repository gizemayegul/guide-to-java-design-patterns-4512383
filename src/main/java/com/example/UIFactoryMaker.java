package com.example;

import java.util.HashMap;
import java.util.function.Supplier;

public class UIFactoryMaker {

  private static HashMap<String, Supplier<UserInterfaceFactory>> factorySuppliers = new HashMap<>();

  static {
    factorySuppliers.put("Red", RedUserInterfaceFactory::new);
    factorySuppliers.put("Blue", BlueUserInterfaceFactory::new);
  }

  public static UserInterfaceFactory getFactory(String color) {
    Supplier<UserInterfaceFactory> factorySupplier = factorySuppliers.get(color);
    if (factorySupplier != null) {
      return factorySupplier.get();
    }
    throw new IllegalArgumentException("Unknown color: " + color);
  }

}
