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

    public void remove(Animal animalToBeRemoved) {
        if(head==null){
            System.out.println("Animal list empty");
        } else {
            AnimalListItem currentItem = head;
            if(currentItem.getValue().equals(animalToBeRemoved)){
                System.out.println("Animal found in first element");
                head = null;
                System.out.println("First Animal removed, and head is empty");
            }
        }
    }
}
