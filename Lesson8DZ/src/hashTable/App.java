package hashTable;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        HashTable table = new HashTable(5);
        ArrayList<DataItem> list = new ArrayList<>();
        list.add(new DataItem(10));
        list.add(new DataItem(25));
        list.add(new DataItem(30));
        list.add(new DataItem(99));
        list.add(new DataItem(20));

        for (DataItem item: list) {
            table.insert(item);
        }
        table.display();
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
