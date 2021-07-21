package de.neuefische.linkedlist;

public class AnimalLinkedList {
    public AnimalListItem head;

    @Override
    public String toString() {
        String result = "";
        return result;

    }
    public void add(Animal newAnimal){
        AnimalListItem item1 = new AnimalListItem(newAnimal);
        head = item1;

    }
}
