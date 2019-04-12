package lesson4.doubleList;

public class DoubleListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Vasya", 11); //O(1)
        list.insertFirst("Petr", 25);
        list.insertFirst("Anna", 19);
        list.insertLast("Stas",22);
        list.display();
        System.out.println();
        list.delete("Petr"); //O(n)
        System.out.println(list.find("Petr").name); //O(n)
        list.delete(); //O(1)
        list.insertFirst("Denis", 10); //O(1)
        list.display();


    }
}
