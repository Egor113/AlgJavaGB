package task1.queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.remove();
        queue.remove();

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
