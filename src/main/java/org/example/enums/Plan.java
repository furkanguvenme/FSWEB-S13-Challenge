package org.example.enums;

public enum Plan {
    BASIC("Mourinho", 10.5);
    private String name;
    private double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
