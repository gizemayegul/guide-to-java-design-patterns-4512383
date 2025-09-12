package com.example;

public class RedUserInterfaceFactory implements UserInterfaceFactory {
  public Button createButton() {
    return new RedButton();
  }

  public ScrollBar createScrollBar() {
    return new RedScrollBar();
  }

}
