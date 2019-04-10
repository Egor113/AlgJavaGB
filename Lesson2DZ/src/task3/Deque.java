package task3;

public class Deque {
    private int[] deque;
    private int rightPtr;
    private int leftPtr;
    private int items;
    private int maxsize;

    public Deque(int size) {
        this.maxsize = size;
        this.deque = new int[maxsize];
        this.rightPtr = 0;
        this.leftPtr = 0;
        this.items = 0;
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public boolean isFull(){
        return (items == maxsize);
    }

    public int getLeft(){
        return deque[leftPtr];
    }

    public int getRight(){
        return deque[rightPtr];
    }

    public void printDeque(){
        for (int i = 0; i < items; i++) {
            System.out.println("[" + i + "]: " + deque[i]);
        }
    }

    public void insertLeft(int i){
        if (items == 0){
            deque[items++] = i;
        }
        else{
            deque[items++] = i;
            leftPtr++;
        }
    }

    public int removeLeft(){
        items--;
        return deque[leftPtr--];
    }

    public void insertRight(int i){
        if (items == 0){
            deque[items++] = i;
        }
        else{
            deque[items++] = i;
            rightPtr++;
        }
    }

    public int removeRight(){
        items--;
        return deque[rightPtr--];
    }
}
