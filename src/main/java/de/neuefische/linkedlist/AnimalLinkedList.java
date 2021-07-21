package de.neuefische.linkedlist;

public class AnimalLinkedList {
    private AnimalListItem head;

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
            }
            currentItem.setNext(newItem);
        }


    }

    public void remove(Animal animalToBeRemoved) {
        if(head==null){
            System.out.println("Animal list empty");
        } else {
            AnimalListItem currentItem = head;
            AnimalListItem previousItem = null;
            while (currentItem != null) {
                if (currentItem.getValue().equals(animalToBeRemoved)) {
                    if(previousItem==null){
                        head = currentItem.getNext();
                    } else {
                        previousItem.setNext(currentItem.getNext());
                    }
//                    System.out.println("Animal found in first element");
//                    head = head.getNext();
//                    System.out.println("First Animal removed, and head is next element");
                }
                previousItem = currentItem;
                currentItem = currentItem.getNext();
            }
        }
    }
}
