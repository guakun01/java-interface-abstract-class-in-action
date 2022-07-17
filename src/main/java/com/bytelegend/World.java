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

interface NameOwner {
    String getType();
}

interface Flyable extends NameOwner {
    default void fly() {
        System.out.println(getType() + " is flying");
    }
}

interface Animal extends NameOwner {
    default void breath() {
        System.out.println(getType() + " is breathing");
    }
}

interface SoundMaker {
    void makeSound();
}

abstract class Pet implements Animal, NameOwner {
    protected String name;

    Pet(String name) {
        this.name = name;
    }

    @Override
    public void breath() {
        System.out.println(getType() + " " + name + " is breathing");
    }
}

class Car implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird implements Flyable, SoundMaker, Animal {
    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public void breath() {
        Animal.super.breath();
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }
}

class Butterfly implements Animal, Flyable {
    @Override
    public String getType() {
        return "Butterfly";
    }

    @Override
    public void breath() {
        Animal.super.breath();
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }
}

class Cat extends Pet implements SoundMaker {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void breath() {
        super.breath();
    }
}

class Fish extends Pet {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Fish";
    }

    @Override
    public void breath() {
        super.breath();
    }
}

class Plane implements Flyable {
    @Override
    public String getType() {
        return "Plane";
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }
}
