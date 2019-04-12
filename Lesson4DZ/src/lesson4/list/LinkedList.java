package lesson4.list;

import lesson4.Link;

public class LinkedList {
    public Link first;

    public LinkedList() {
        this.first = null;
    }

    public void insert(String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public Link find(String name) {
        Link current = first;
        while (current.next != null) {
            if (current.name == name){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link delete(String name) {
        Link current = first;
        Link prev = first;
        while (current.name != name) {
            if (current.name == null)
                return null;
            else {
                prev = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }
}
