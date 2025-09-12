package com.example;

public class BlueUserInterfaceFactory implements UserInterfaceFactory {
  public Button createButton() {
    return new BlueButton();
  }

  public ScrollBar createScrollBar() {
    return new BlueScrollBar();
  }
}
