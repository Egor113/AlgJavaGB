package task1.PriorityQueue;

public class PriorityQueue {
    private int maxsize;
    private int[] queue;
    private int items;

    public PriorityQueue(int size) {
        this.maxsize = size;
        this.queue = new int[maxsize];
        this.items = 0;
    }

    public boolean isFull(){
        return (items == maxsize);
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public int peek(){
        return queue[items - 1];
    }

    public int remove(){
        return queue[--items];
    }

    public void insert(int el){
        int i;
        if (items == 0){
            queue[items++] = el;
        }
        else {
            for (i = items-1; i >= 0; i--) {
                if (el > queue[i]){
                    queue[i+1] = queue[i];
                }
                else break;
            }
            queue[i + 1] = el;
            items++;
        }
    }
}
