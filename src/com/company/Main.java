package com.company;

public class Main {

    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        bowl.putFood(100);

        Cat [] cat = {
                new Cat("Vasia", 10),
                 new Cat("Murzic", 15),
                new Cat("Lolo", 30),
                new Cat("Gosha", 25),
                new Cat("Momo", 20),
                new Cat("Gaaga", 13)
                        };


        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(bowl);

        }







        }


//        Cat c1 = new Cat("Vasia", 10);
//        Bowl bowl = new Bowl();
//        bowl.putFood(10);
//        c1.eat(bowl);
    }



//	 write your code here

