package task2;

import java.util.ArrayList;

public class Rucksack {
    private int maxWeight;
    private int bestPrice;

    private ArrayList<Item> bestItems = null;

    public Rucksack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public ArrayList<Item> getBestItems() {
        return bestItems;
    }

    //вычисляет общий вес набора предметов
    private int calcWeigth(ArrayList<Item> items)
    {
        int sumW = 0;
        for (Item i: items
             ) {
            sumW += i.weight;
        }
        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private int calcPrice(ArrayList<Item> items)
    {
        int sumPrice = 0;
        for (Item i: items
                ) {
            sumPrice += i.value;
        }
        return sumPrice;
    }

    //проверка, является ли данный набор лучшим решением задачи
    private void checkSet(ArrayList<Item> items)
    {
        if (bestItems == null)
        {
            if (calcWeigth(items) <= maxWeight)
            {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
        else
        {
            if(calcWeigth(items) <= maxWeight && calcPrice(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    //создание всех наборов перестановок значений
    public void makeAllSets(ArrayList<Item> items)
    {
        if (items.size() > 0)
            checkSet(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newSet = new ArrayList<>(items);

            newSet.remove(i);

            makeAllSets(newSet);
        }

    }

    public int getMaxValue(Item[] items){
        int localMaxValue = 0;
        int localMaxWeight = 0;
        int sumValue = 0;
        int sumWeight = 0;
        for (int i = 0; i < items.length; i++) {
            sumWeight = items[i].weight;
            sumValue = items[i].value;
            for (int j = 0; j < items.length; j++) {
                if ((!items[i].name.equals(items[j].name)) && (sumWeight + items[j].weight <= maxWeight)){
                    sumWeight += items[j].weight;
                    sumValue += items[j].value;
                }
            }
            if (sumValue > localMaxValue){
                localMaxValue = sumValue;
                localMaxWeight = sumWeight;
            }
            sumValue = 0;
            sumWeight = 0;
        }
        return localMaxValue;
    }
}
