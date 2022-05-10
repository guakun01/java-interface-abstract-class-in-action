package com.bytelegend;

import java.util.Arrays;
import java.util.List;

public class World {
    public static List<Object> objects = Arrays.asList(new Cat("Tom"), new Car(), new Bird(), new Fish("Nemo"), new Plane(), new Butterfly());

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everyFlyableObjectFly() {
        for (Object obj : objects) {
            if (obj instanceof Flyable) {
                ((Flyable) obj).fly();
            }
        }
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everySoundMakerMakeSound() {
        for (Object obj : objects) {
            if (obj instanceof SoundMaker) {
                ((SoundMaker) obj).makeSound();
            }
        }
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everyAnimalBreath() {
        for (Object obj : objects) {
            if (obj instanceof Animal) {
                ((Animal) obj).breath();
            }
        }
    }
}

interface Flyable {
    void fly();
}

interface Animal {
    void breath();
}

interface SoundMaker {
    void makeSound();
}

abstract class Pet {
    protected String name;

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird implements Flyable, Animal, SoundMaker {

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void breath() {
        System.out.println("Bird is breathing");
    }
}

class Butterfly implements Animal, Flyable {
    @Override
    public void fly() {
        System.out.println("Butterfly is flying");
    }

    @Override
    public void breath() {
        System.out.println("Butterfly is breathing");
    }
}

class Cat extends Pet implements Animal, SoundMaker {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Cat " + name + " is breathing");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Fish extends Pet implements Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Fish " + name + " is breathing");
    }
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
