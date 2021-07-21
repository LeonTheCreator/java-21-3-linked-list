package de.neuefische.linkedlist;

public class AnimalLinkedList {
    public AnimalListItem head;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (head == null) {
            return result.toString();
        }
        AnimalListItem currentItem = head;
        result.append(currentItem.getValue().getName());
        while (currentItem.getNext() != null) {
            result.append(" -> ");
            currentItem = currentItem.getNext();
            result.append(currentItem.getValue().getName());
            System.out.println(result);
        }

        return result.toString();

    }
    public void add(Animal newAnimal){
        AnimalListItem newItem = new AnimalListItem(newAnimal);
        if (head == null) {
            head = newItem;
        } else {
            AnimalListItem currentItem = head;
            while (currentItem.getNext() != null) {
                currentItem = currentItem.getNext();
//                System.out.println("head: " + head.getValue());
//                AnimalListItem newItem = new AnimalListItem(newAnimal);
//                head.setNext(newItem);
//                head = newItem;
            }
            currentItem.setNext(newItem);
        }


    }
}
