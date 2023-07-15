package org.example.oops.inheritence;

public class Cat extends Animal {
    public static void main(String[] args) {


    }
    void catSpeak(){
        System.out.println("Cat Speaks meow");
    }

    @Override
    public void animalSit() {
        System.out.println("animal sat on ground");
    }

    void animalWalk() {
        System.out.println("Cat Walks");
    }


    void catJumps() {
        System.out.println("Cat Jumps");
    }

    public void animalGo() {
        System.out.println("cat Gone");
    }

}
