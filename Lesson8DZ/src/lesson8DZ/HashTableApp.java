package lesson8DZ;

import java.util.ArrayList;

public class HashTableApp {
    public static void main(String[] args) {
        HashTableChain table = new HashTableChain(9);
        ArrayList<ChainItem> list = new ArrayList<>();
        list.add(new ChainItem(11));
        list.add(new ChainItem(78));
        list.add(new ChainItem(45));
        list.add(new ChainItem(11));
        list.add(new ChainItem(35));
        list.add(new ChainItem(78));
        list.add(new ChainItem(55));
        list.add(new ChainItem(22));
        list.add(new ChainItem(40));

        for (ChainItem item: list) {
            table.insert(item);
        }
        //table.display();
        //System.out.println();
        System.out.println(table.find(11).getKey());

    }
}
