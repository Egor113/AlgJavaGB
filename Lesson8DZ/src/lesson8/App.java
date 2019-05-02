package lesson8;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        HashTable table = new HashTable(5);
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(10));
        list.add(new Item(25));
        list.add(new Item(30));
        list.add(new Item(99));
        list.add(new Item(20));

        for (Item item: list) {
            table.insert(item);
        }
        //table.display();
        //System.out.println(table.find(33).getKey());
        System.out.println(table.delete(11).getKey());
    }

    public static int getPrime(int min) {
        for (int i = min + 1; true; i++) {
            if (isPrime(i)) return i;
        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; (j * j <= n); j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}
