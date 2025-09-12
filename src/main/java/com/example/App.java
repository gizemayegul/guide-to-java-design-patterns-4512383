package com.example;

public class App {

    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("Red");
        UserInterface mountainUserInterface = createUserInterface("Blue");
        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);
    }

    private static UserInterface createUserInterface(String color) {
        var uiMaker = UIFactoryMaker.getFactory(color);
        return new UserInterface(uiMaker.createButton(), uiMaker.createScrollBar());
    }

}
