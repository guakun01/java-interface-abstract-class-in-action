package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import com.github.hcsp.test.helper.ClassInspector;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

public class WorldTest {
    @Test
    public void testClassHierarchy() {
        Assertions.assertTrue(
                Stream.of(Bird.class, Plane.class, Butterfly.class)
                        .allMatch(Flyable.class::isAssignableFrom));
        Assertions.assertTrue(
                Stream.of(Bird.class, Cat.class, Fish.class, Butterfly.class)
                        .allMatch(Animal.class::isAssignableFrom));
        Assertions.assertTrue(
                Stream.of(Cat.class, Car.class, Bird.class)
                        .allMatch(SoundMaker.class::isAssignableFrom));
        Assertions.assertTrue(
                Stream.of(Cat.class, Fish.class).allMatch(Pet.class::isAssignableFrom));
    }

    @ParameterizedTest
    @CaptureSystemOutput
    @CsvSource(
            delimiter = ';',
            value = {
                "Bird;breath;Bird is breathing",
                "Bird;fly;Bird is flying",
                "Butterfly;breath;Butterfly is breathing",
                "Butterfly;fly;Butterfly is flying",
                "Car;makeSound;BEEP BEEP",
                "Cat;breath;Cat Tom is breathing",
                "Cat;makeSound;Meow",
                "Fish;breath;Fish Nemo is breathing",
                "Plane;fly;Plane is flying",
            })
    public void testOutput(
            String klass, String method, String expected, CaptureSystemOutput.OutputCapture capture)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        capture.expect(Matchers.containsString(expected));
        Object target =
                World.objects.stream()
                        .filter(o -> o.getClass().getSimpleName().equals(klass))
                        .findFirst()
                        .get();
        target.getClass().getDeclaredMethod(method).invoke(target);
    }

    @Test
    public void testExtra() {
        ClassInspector.assertNoDeclaredFields(Cat.class);
        ClassInspector.assertNoDeclaredFields(Fish.class);
    }
}
