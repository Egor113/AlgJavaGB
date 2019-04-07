import java.util.ArrayList;

public class Arr {
    private int [] array;
    private int index;

    public Arr(int len) {
        this.array = new int[len];
        index = 0;
    }

    public void addElement(int el){
        if (index < array.length){
            array[index] = el;
            index ++;
        }
        else System.out.println("Массив заполнен");
    }

    public void printArray(){
        System.out.println("Элементы массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Как происходит удаление?
    public void deleteElement(int el){
        int i = 0;
        while (el != array[i]){
            i++;
        }
        for (int j = i; j < index-1; j++) {
            array[j] = array[j+1];
        }
        index--;
        array[index] = 0;
    }
    
    public boolean findElement(int el){
        boolean find = false;
        for (int i = 0; i < index; i++) {
            if (array[i] == el) find = true;
        }
        return find;
    }
}


