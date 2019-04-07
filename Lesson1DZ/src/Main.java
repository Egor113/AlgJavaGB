public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr(5);
        arr.addElement(1);
        arr.addElement(2);
        arr.addElement(3);
        arr.addElement(4);
        arr.addElement(5);
        arr.printArray();

        arr.deleteElement(2);
        arr.printArray();
        arr.addElement(7);
        arr.printArray();
    }
}
