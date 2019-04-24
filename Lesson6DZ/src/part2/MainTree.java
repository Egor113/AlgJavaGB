package part2;

import part1.Tree;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Person[] people = new Person[]{
                new Person("Ivan",60,60),
                new Person("Anton",66,66),
                new Person("Anna",70,70),
                new Person("Sergey",81,81),
                new Person("Egor",67,67),
                new Person("Denis",50,50),
                new Person("Oleg",55,55),
                new Person("Nick",57,57),
                new Person("Dima",40,40),
                new Person("Vlad",45,45),
                new Person("Nikita",31,31),
        };

        for (int i = 0; i < people.length; i++) {
            tree.insert(people[i]);
        }
        //tree.find(57).display();
        tree.display();
        //tree.max().display();
        System.out.println();
        tree.delete(50);

        tree.display();
    }
}
