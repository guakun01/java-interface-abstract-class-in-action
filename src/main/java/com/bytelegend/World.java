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
            if (obj instanceof Butterfly) {
                ((Butterfly) obj).fly();
            } else if (obj instanceof Plane) {
                ((Plane) obj).fly();
            } else if (obj instanceof Bird) {
                ((Bird) obj).fly();
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
            if (obj instanceof Cat) {
                ((Cat) obj).makeSound();
            } else if (obj instanceof Car) {
                ((Car) obj).makeSound();
            } else if (obj instanceof Bird) {
                ((Bird) obj).makeSound();
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
            if (obj instanceof Cat) {
                ((Cat) obj).breath();
            } else if (obj instanceof Bird) {
                ((Bird) obj).breath();
            } else if (obj instanceof Fish) {
                ((Fish) obj).breath();
            } else if (obj instanceof Butterfly) {
                ((Butterfly) obj).breath();
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
    protected final String name;

    public Pet(String name) {
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
    @Override
    public void breath() {
        System.out.println("Butterfly is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Butterfly is flying");
    }
}

class Cat extends Pet implements SoundMaker {
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

class Fish extends Pet {

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
