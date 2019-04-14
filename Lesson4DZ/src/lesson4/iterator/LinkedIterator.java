package lesson4.iterator;

import lesson4.list.LinkedList;

public class LinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iterator = new LinkIterator(list);
        iterator.insertBefore("Ivan", 35);
        iterator.insertBefore("Oleg", 21);
        iterator.insertBefore("Anna", 25);
        iterator.display();
        System.out.println();

        iterator.reset();
        iterator.nextLink();
        iterator.insertBefore("1111",28);
        iterator.display();
        System.out.println();

        iterator.reset();
        iterator.deleteCurrent();
        iterator.deleteCurrent();
        iterator.insertAfter("Denis",35);
        iterator.insertAfter("Sergey",21);
        iterator.display();

    }
}
