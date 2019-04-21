package task2;

public class Item {
    String name;
    int weight;
    int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                ", weight: " + weight +
                ", value: " + value;
    }
}
