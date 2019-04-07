public class Main {
    public static void main(String[] args) {
        //testPart1();
        testPart2();
    }

    public static void testPart1(){
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
        System.out.println(arr.findElement(1));
    }

    public static void testPart2(){
        Arr arr1 = new Arr(10000);
        arr1.setRandom(100);
        arr1.sortBubble();

        Arr arr2 = new Arr(10000);
        arr2.setRandom(100);
        arr2.sortSelect();

        Arr arr3 = new Arr(10000);
        arr3.setRandom(100);
        arr3.sortInsert();

    }
}
