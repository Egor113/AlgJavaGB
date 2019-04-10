package task1.PriorityQueue;

public class MainPriority {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(4);
        queue.insert(0);
        queue.insert(56);
        queue.insert(-100);
        queue.insert(500);

        while (!queue.isEmpty()){
            System.out.print(queue.remove() + " ");
        }
    }
}
