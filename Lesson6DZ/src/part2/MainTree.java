package part2;

import part1.Tree;

import java.util.ArrayList;
import java.util.Random;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        ArrayList<ArrayList> treeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            Random rnd = new Random();
            for (int j = 0; j < 10; j++) {
                list.add(-100 + rnd.nextInt(200));
            }
            treeList.add(list);
        }

        for (int i = 0; i < treeList.size(); i++) {
            for (int j = 0; j < treeList.get(i).size(); j++) {
                System.out.print(treeList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < treeList.size(); i++) {
            for (int j = 0; j < treeList.get(i).size(); j++) {
                System.out.print(treeList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
