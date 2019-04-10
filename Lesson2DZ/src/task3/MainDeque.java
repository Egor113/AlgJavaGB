package task3;

public class MainDeque {

    public static void main(String[] args) {
        Deque deque = new Deque(4);
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertLeft(4);

        while (!deque.isEmpty()){
            System.out.println(deque.removeLeft());
        }
    }

}
