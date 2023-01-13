package com.bytelegend;

import java.util.Arrays;
import java.util.List;

public class World {
    public static List<Object> objects =
            Arrays.asList(
                    new Cat("Tom"),
                    new Car(),
                    new Bird(),
                    new Fish("Nemo"),
                    new Plane(),
                    new Butterfly());

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everyFlyableObjectFly() {
        for (Object obj : objects) {
            ((Flyable) obj).fly();
        }
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everySoundMakerMakeSound() {
        for (Object obj : objects) {
            ((SoundMaker) obj).makeSound();
        }
    }

    /**
     * After refactoring, please try to simplify these messy method
     * `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate
     * the benefits of polymorphism.
     */
    public static void everyAnimalBreath() {
        for (Object obj : objects) {
            ((Animal) obj).breath();
        }
    }
}

interface Flyable {
    default void fly() {
    }
}

interface Animal {
    default void breath() {
    }
}

interface SoundMaker {
    default void makeSound() {
    }
}

abstract class Pet {
    private final String name;

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car implements SoundMaker {
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird implements Animal, Flyable, SoundMaker {
    public void breath() {
        System.out.println("Bird is breathing");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

class Butterfly implements Animal, Flyable {
    public void breath() {
        System.out.println("Butterfly is breathing");
    }

    public void fly() {
        System.out.println("Butterfly is flying");
    }
}

class Cat extends Pet implements Animal, SoundMaker {

    Cat(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Cat " + getName() + " is breathing");
    }

    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Fish extends Pet implements Animal {
    public Fish(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Fish " + getName() + " is breathing");
    }
}

class Plane implements Flyable {
    public void fly() {
        System.out.println("Plane is flying");
    }
}
