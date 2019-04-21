package task2;

import java.util.ArrayList;

public class MainRucksack {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item("Compass",1,8),
                new Item("Camera",5,2),
                new Item("Knife",2,10),
                new Item("Potato",5,6),
                //new Item("Fork",2,2)
        };
        ArrayList<Item> newItems = new ArrayList<>();
        newItems.add(new Item("Compass",1,8));
        newItems.add(new Item("Camera",5,2));
        newItems.add(new Item("Knife",2,10));
        newItems.add(new Item("Potato",5,6));
        //newItems.add(new Item("Fork",2,2));


        Rucksack rucksack = new Rucksack(8);
        System.out.println(rucksack.getMaxValue(items));
        rucksack.makeAllSets(newItems);
        for (Item i: rucksack.getBestItems()
             ) {
            System.out.println(i);
        }
    }
}
