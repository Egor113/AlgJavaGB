package lesson8DZ;

import java.util.ArrayList;

public class HashTableApp {
    public static void main(String[] args) {
        HashTableChain table = new HashTableChain(20);
        ArrayList<ChainItem> list = new ArrayList<>();
        list.add(new ChainItem(11));
        list.add(new ChainItem(91));
        list.add(new ChainItem(11));


        for (ChainItem item: list) {
            table.insert(item);
        }

        table.display();
    }
}
