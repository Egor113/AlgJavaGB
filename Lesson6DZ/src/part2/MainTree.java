package part2;

import java.util.ArrayList;
import java.util.Random;

public class MainTree {
    public static void main(String[] args) {
        //Создадим список деревьев
        ArrayList<Tree> treeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            treeList.add(new Tree());
        }

        //Создадим список списков из целых чисел
        ArrayList<ArrayList> intList = new ArrayList<>();

        //Заполним списки случайными числами
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            Random rnd = new Random();
            for (int j = 0; j < 10; j++) {
                list.add(-100 + rnd.nextInt(200));
            }
            intList.add(list);
        }

        System.out.println("Исходные массивы чисел: ");
        for (int i = 0; i < intList.size(); i++) {
            for (int j = 0; j < intList.get(i).size(); j++) {
                System.out.print(intList.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();


        //Добавим элементы в список деревьев
        for (int i = 0; i < intList.size(); i++) {
            for (int j = 0; j < intList.get(i).size(); j++) {
                treeList.get(i).insert((int)intList.get(i).get(j));
            }
        }


        for (int i = 0; i < treeList.size(); i++) {
            System.out.println("Дерево №" + i);
            treeList.get(i).display();
            System.out.println();
        }

    }
}
