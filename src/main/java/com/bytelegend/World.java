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
    default void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }
}

interface Animal {
    default void breath() {
        System.out.println(this.getClass().getSimpleName() + " is breathing");
    }
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
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird implements Flyable, Animal, SoundMaker {

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

class Butterfly implements Animal, Flyable {
}

class Cat extends Pet implements Animal, SoundMaker {

    public Cat(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Cat " + name + " is breathing");
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}

class Fish extends Pet implements Animal {

    public Fish(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Fish " + name + " is breathing");
    }
}

class Plane implements Flyable {
}
