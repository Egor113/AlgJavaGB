import java.util.ArrayList;
import java.util.Random;

public class Arr {
    private int [] array; //Массив
    private int index;

    public Arr(int len) {
        this.array = new int[len];
        index = 0;
    }

    //Метод добавления элемента массива
    public void addElement(int el){
        if (index < array.length){
            array[index] = el;
            index ++;
        }
        else System.out.println("Массив заполнен");
    }

    //Метод вывода элементов массива на экран
    public void printArray(){
        System.out.println("Элементы массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Метод удаления элемента массива
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

    //Линейный метод поиска элемента массива
    public boolean findElement(int el){
        boolean find = false;
        for (int i = 0; i < index; i++) {
            if (array[i] == el) find = true;
        }
        return find;
    }

    //Метод заполнения массива случайными
    //числами в диапозоне [0..bound]
    public void setRandom(int bound){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(bound);
        }
    }

    //Метод сортировки пузырьком
    public void sortBubble() {
        long startTime = System.currentTimeMillis();
        int in, out;
        for (out = array.length - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1])
                    change(in, in + 1);
            }
        }
        long stopTime = System.currentTimeMillis();
        long time = stopTime-startTime;
        System.out.println("Время работы сортировки пузырьком: " + time + " мс");
    }

    //Сортировка выбором
    public void sortSelect() {
        long startTime = System.currentTimeMillis();
        int in, out, mark;
        for (out = 0; out < array.length; out++) {
            mark = out;
            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[mark]) {
                    mark = in;
                }
            }
            change(out, mark);
        }
        long stopTime = System.currentTimeMillis();
        long time = stopTime-startTime;
        System.out.println("Время работы сортировки методом выбора: " + time + " мс");
    }

    //Сортировка вставкой
    public void sortInsert() {
        long startTime = System.currentTimeMillis();
        int in, out;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
        long stopTime = System.currentTimeMillis();
        long time = stopTime-startTime;
        System.out.println("Время работы сортировки методом вставки: " + time + " мс");
    }

    //Метод перестановки двух элементов массива
    private void change(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}


