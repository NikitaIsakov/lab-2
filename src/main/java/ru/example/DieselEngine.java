package ru.example;

public class DieselEngine implements Engine {
    private String power;

    public DieselEngine(String power) {
        this.power = power;
    }

    @Override
    public String getPower() {
        return "Diesel engine power: " + power;
    }
}
