package de.neuefische.linkedlist;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;


    public AnimalListItem(Animal value) {
        this.value = value;
    }
    public String toString(){
        return "platzhalter";
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }
}
