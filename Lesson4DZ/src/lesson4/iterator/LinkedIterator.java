package lesson4.iterator;

import lesson4.list.LinkedList;

public class LinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        HashSet;
//        LinkedHashSet;
//        ArrayList
//        LinkedList;
        LinkIterator iterator = new LinkIterator(list);
        iterator.insertBefore("Ivan", 35);
        iterator.insertBefore("Oleg", 21);
        iterator.insertBefore("Anna", 25);
        iterator.display();
//        iterator.insertAfter();

    }
}
