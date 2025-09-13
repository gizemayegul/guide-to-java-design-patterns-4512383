package com.example;

public class FrenchLocalizedAdapter implements LocalizedMessage {

  private final FrenchLocalizedMessage frenchLocalizedMessage;

  public FrenchLocalizedAdapter() {

    frenchLocalizedMessage = new FrenchLocalizedMessage();
  }

  @Override
  public void sayHello() {
    frenchLocalizedMessage.sayBonjour();
  }

}
