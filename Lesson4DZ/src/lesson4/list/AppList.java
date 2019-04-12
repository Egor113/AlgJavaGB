package lesson4.list;

public class AppList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insert("Anton", 22);
        list.insert("Oleg", 26);
        list.insert("Igor", 31);
//       Igor -> Oleg -> Anton

        list.display();
        System.out.println();

        list.delete("Oleg");
        System.out.println(list.find("Anton").name);
//        if (!lesson4.list.isEmpty()) {
//            lesson4.list.delete();
//        }
        list.display();
    }
}
