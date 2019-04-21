package task2;

import java.util.ArrayList;

public class MainRucksack {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Compass",1,8));
        //items.add(new Item("Camera",5,2));
        items.add(new Item("Knife",2,10));
        //items.add(new Item("Potato",5,6));
        items.add(new Item("Fork",2,2));

        Rucksack rucksack = new Rucksack(3);
        System.out.println("Суммарная ценность вещей в рюкзаке,");
        System.out.println("рассчитанная методом перебора: "  + rucksack.getMaxValue(items));
        System.out.println();

        System.out.println("Список вещей в рюкзаке, рассчитанный с помощью рекурсии:");
        rucksack.makeAllSets(items);
        for (Item i: rucksack.getBestItems()) {
            System.out.println(i);
        }
    }
}
