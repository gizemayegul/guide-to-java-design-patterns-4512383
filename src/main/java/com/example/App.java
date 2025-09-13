package com.example;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchLocalizedMessage = new FrenchLocalizedAdapter();
        var frenchGreeting = new Greeting(frenchLocalizedMessage);
        frenchGreeting.print();
    }

}
