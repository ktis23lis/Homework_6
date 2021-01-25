package com.company;

public class Bowl {
    public int food;


    public void putFood(int amount) {
        this.food += amount;
        System.out.println("Food filled, now there's " + food);
    }
    public void decreaseFood(int amount) {
        this.food -= amount;

    }

    public int getFood() {
        return food;
    }

}
