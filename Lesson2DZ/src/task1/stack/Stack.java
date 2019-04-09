package task1.stack;

public class Stack {
    private char[] stack;
    private int top;
    private int maxsize;

    public Stack(int size) {
        this.maxsize = size;
        this.stack = new char[maxsize];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxsize - 1);
    }

    public void push(char ch){
        stack[++top] = ch;
    }

    public char pop(){
        return stack[top--];
    }

    public char peek(){
        return stack[top];
    }
}
