package org.example.lab_05.hw_02;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static List<Dog> createList() {
        List<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("Rocky", Breed.DACHSHUNDS, 4));
        dogs.add(new Dog("Finn", Breed.LABRADOR, 6));
        dogs.add(new Dog("Leo", Breed.SHORTHAIRED, 2));
        return dogs;
    }

    @Test
    void createListDogs() {
        List<Dog> dogs = createList();
        assertEquals(3, dogs.size());
    }

    @Test
    void shouldReturnExceptionWhenListIsEmpty() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            Main.getDodWithMaxAge(new LinkedList<>());
            Main.checkSameName(new LinkedList<>());
        });

        assertEquals("No value present", exception.getMessage());
    }

    @Test
    void testGetDodWithMaxAgePositive() {
        List<Dog> dogs = createList();

        Dog actual = Main.getDodWithMaxAge(dogs);
        assertEquals(6, actual.getAge());
    }

    @Test
    void testGetDodWithMaxAgeNegative() {
        List<Dog> dogs = createList();

        Dog actual = Main.getDodWithMaxAge(dogs);
        assertNotEquals(2, actual.getAge());
        assertNotEquals(4, actual.getAge());
    }

    @Test
    void testCheckSameNamePositive() {
        List<Dog> dogs = createList();
        dogs.add(new Dog("Leo", Breed.TERRIERS, 3));

        boolean hasSameName = Main.checkSameName(dogs);
        assertTrue(hasSameName);
        dogs.remove(dogs.size() - 1);
    }

    @Test
    void testCheckSameNameNegative() {
        List<Dog> dogs = createList();

        boolean hasSameName = Main.checkSameName(dogs);
        assertFalse(hasSameName);
    }
}