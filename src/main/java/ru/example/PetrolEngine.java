package ru.example;

public class PetrolEngine implements Engine {
    private String power;

    public PetrolEngine(String power) {
        this.power = power;
    }

    @Override
    public String getPower() {
        return "Petrol engine power: " + power;
    }
}
