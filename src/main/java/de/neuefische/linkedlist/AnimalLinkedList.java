package de.neuefische.linkedlist;

public class AnimalLinkedList {
    public AnimalListItem head;

    @Override
    public String toString() {
        String result = "";
        if (head == null) {
            return "";
        }
        String start = head.getValue().getName();
        String arrow = " -> ";
        AnimalListItem currentListElement = head;
        while(currentListElement.getNext() != null) {
            start += arrow;
            currentListElement = currentListElement.getNext();
            start += currentListElement.getValue().getName();
        }
        return start;

    }
    public void add(Animal newAnimal){
        AnimalListItem item = new AnimalListItem(newAnimal);

        if (head == null) {
            head = item;
        } else {
            AnimalListItem currentItem = head;
            while(currentItem.getNext() != null) {
                currentItem = currentItem.getNext();
            }
            currentItem.setNext(item);

        }


    }
}
