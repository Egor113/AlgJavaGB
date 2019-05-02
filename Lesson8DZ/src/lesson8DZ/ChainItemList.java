package lesson8DZ;

import java.util.ArrayList;

public class ChainItemList {
    private ArrayList<ChainItem> list;

    public ChainItemList() {
        this.list = new ArrayList<>();
    }

    public ArrayList<ChainItem> getList() {
        return list;
    }

    public void addItem(ChainItem item){
        list.add(item);
    }
}
