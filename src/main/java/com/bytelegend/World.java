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

interface Flyable {
    void fly();
}

interface Animal {
    void breath();
}

interface SoundMaker {
    void makeSound();
}

abstract class Pet implements Animal {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void breath() {
        System.out.println(this.name + " is breathing");
    }
}

class Car implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("BEEP BEEP");
    }
}

class Bird implements Animal, Flyable, SoundMaker {
    @Override
    public void breath() {
        System.out.println("Bird is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
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

class Cat extends Pet implements SoundMaker {
    public Cat(String name) {
        super(name);
    }

    public void breath() {
        System.out.println("Cat " + super.getName() + " is breathing");
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
        System.out.println("Fish " + super.getName() + " is breathing");
    }
}

class Plane implements Flyable {
    public void fly() {
        System.out.println("Plane is flying");
    }
}
