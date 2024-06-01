package ru.example;

public class Car {
    private Engine engine;
    private String model;

    public Car(Engine engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Car model: " + model);
        System.out.println(engine.getPower());
    }

    public void setModel(String model) {
        this.model = model;
    }
}
