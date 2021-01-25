package com.company;

public class Cat {
    protected  String name;
    protected int hunger;
    private  static boolean full = true;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;


    }

    public void eat (Bowl bowl){
        if (bowl.food >= hunger){
            bowl.decreaseFood(hunger);
            full = true;
            System.out.println("Did the "+ name + " eat? "+ full +
                    "\nHe eat " + hunger +
                    "\n" + name + " is fuul\n" );
            System.out.println("Food in the bowl " + bowl.food);
        }else {
            full = false;
            System.out.println("Did the "+ name + " eat? "+ full +
                    "\n" + name + " wants " + hunger + " eat, put on bowl more food ");

        }
    }

    public static boolean isFull() {
        return full;
    }

    public static void setFull(boolean full) {
        Cat.full = full;
    }
}
