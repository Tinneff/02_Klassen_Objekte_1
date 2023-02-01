package com.cc.java;

public class App {
    
    public static void main(String[] args) {

<<<<<<< HEAD
        Cat cat = new Cat("Grizabella", "white", 29);

        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge()));  


        cat.setFurColor("grey");
        output(cat.getFurColor());

        output("-------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);

        output(cat2.getName());
        output(cat2.getFurColor());
        output(String.valueOf(cat2.getAge())); 

    }

    private static void output(String outputStr) {
=======
        Cat cat = new Cat(); 
        output("Blick von aussen: " + cat);
        output(cat.tellYourAddress());

        output("-------------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output(cat2.tellYourAddress());

    }

    public static void output(String outputStr) {
>>>>>>> 5a74d62de4ee7062de46018c8749e0cab5ff3f05
        System.out.println(outputStr);
    }

}


