package org.example.oops.inheritence;

public class Example {


    public void animalSit(){

    }
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.animalSpeak();
        animal.animalWalk();
        animal.animalJump();
        animal.animalSit();




        Cat cat = (Cat) animal;
        cat.catSpeak();
        cat.animalJump();
        cat.animalSit();
        cat.animalGo();
        cat.animalGo();

        Cat obj = new Cat();
       obj.animalGo();

    }
}

