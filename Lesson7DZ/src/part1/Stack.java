package part1;

public class Stack {
    private int[] stack;
    private int top;
    private int maxsize;

    public Stack(int size) {
        this.maxsize = size;
        this.stack = new int[maxsize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public void push(int i) {
        stack[++top] = i;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }
}
