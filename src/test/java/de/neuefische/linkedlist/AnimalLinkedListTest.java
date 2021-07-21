package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalLinkedListTest {

    @Test
    public void testToStringEmpty() {
        //given
        AnimalLinkedList list = new AnimalLinkedList();
        //when
        String actual = list.toString();
        String expected = "";
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testAddOne() {
        //given
        Animal animal1 = new Animal("Dumbo");
        AnimalLinkedList list = new AnimalLinkedList();
        //when
        list.add(animal1);
        String actual = list.toString();
        String expected = "Dumbo";
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwo() {
        //given
        Animal animal1 = new Animal("Dumbo");
        Animal animal2 = new Animal("Bambi");

        AnimalLinkedList list = new AnimalLinkedList();
        //when
        list.add(animal1);
        list.add(animal2);
        String actual = list.toString();
        String expected = "Dumbo -> Bambi";
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testAddThree() {
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

    @Test
    public void testAddFour() {
        //given
        Animal animal1 = new Animal("Dumbo");
        Animal animal2 = new Animal("Bambi");
        Animal animal3 = new Animal("Hedwig");
        Animal animal4 = new Animal("Snoopy");

        AnimalLinkedList list = new AnimalLinkedList();
        //when
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);
        String actual = list.toString();
        String expected = "Dumbo -> Bambi -> Hedwig -> Snoopy";
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveLast() {
        //given
        Animal animal1 = new Animal("Dumbo");
        Animal animal2 = new Animal("Bambi");
        Animal animal3 = new Animal("Hedwig");
        Animal animal4 = new Animal("Snoopy");

        AnimalLinkedList list = new AnimalLinkedList();
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);

        //when
        list.remove(animal4);
        String actual = list.toString();
        String expected = "Dumbo -> Bambi -> Hedwig";
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveEmpty() {
        //given
        Animal animal4 = new Animal("Snoopy");
        AnimalLinkedList list = new AnimalLinkedList();
        list.add(animal4);

        //when
        list.remove(animal4);
        String actual = list.toString();
        String expected = "";

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFirst() {
        //given
        Animal animal4 = new Animal("Snoopy");
        AnimalLinkedList list = new AnimalLinkedList();
        list.add(animal4);

        //when
        list.remove(animal4);
        String actual = list.toString();
        String expected = "";

        //then
        assertEquals(expected, actual);
    }



}