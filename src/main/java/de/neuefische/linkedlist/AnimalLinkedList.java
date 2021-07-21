package de.neuefische.linkedlist;

public class AnimalLinkedList {
    public AnimalListItem head;

    @Override
    public String toString() {
        String result = "";
        if (head == null) {
            return "";
        }
        return head.getValue().getName();

    }
    public void add(Animal newAnimal){
        if (head == null) {
            AnimalListItem item1 = new AnimalListItem(newAnimal);
            System.out.println(item1.getNext());
            System.out.println(item1.getValue());
            head = item1;
        } else {
           AnimalListItem item2 = new AnimalListItem(newAnimal);
           head.setNext(item2);
           head = item2;
           System.out.print(head.getValue());
            System.out.print(head.getNext());
        }


    }
}
