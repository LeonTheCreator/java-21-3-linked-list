package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalLinkedListTest {
    @Test
    //given
    Animal animal1 = new Animal("Dumbo");
    Animal animal2 = new Animal("Bambi");
    Animal animal3 = new Animal("Hedwig");

    AnimalLinkedList list = new AnimalLinkedList();
    //when
    list.add(animal1);
    list.add(animal2);
    list.add(animal3);
    String actual = list.toString();
    String expected = "Dumbo -> Bambi -> Hedwig";
    //then
    assertEquals(expected, actual);



}