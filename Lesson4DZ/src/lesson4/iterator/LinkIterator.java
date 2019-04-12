package lesson4.iterator;

import lesson4.Link;
import lesson4.list.LinkedList;

public class LinkIterator {
    private Link current;
    private Link prev;
    private LinkedList list;

    public LinkIterator(LinkedList list) {
        this.list = list;
        reset();
    }

    public void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nexLink() {
        prev = current;
        current = current.next;
    }

    /**
     * @return - true, если дошел до конца
     */
    public boolean atEnd() {
        return (current.next == null);
    }

    public void insertBefore(String name, int age) {
        list.first = current;
        prev = current;
        list.insert(name, age);
        current = list.first;
    }

    public void insertAfter() {
    }

    public String deleteCurrent() {
        return null;
    }

    public Link getCurrent() {
        return current;
    }

    public void display() {
        reset();
        while (!(current == null)){
            this.current.displayNode();
            this.nexLink();
        }
    }


}
