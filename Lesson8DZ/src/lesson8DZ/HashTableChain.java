package lesson8DZ;

public class HashTableChain {
    private ChainItemList[] hashArray;
    private int sizeArr;
    private ChainItem nonItem;

    public HashTableChain(int size) {
        this.sizeArr = size;
        this.hashArray = new ChainItemList[sizeArr];
        nonItem = new ChainItem(-1);
    }

    public int hashFunc(int key) {
        return key % sizeArr;
    }

    public int secondHashFunc(int key) {
        return 33 - key % 33;
    }

    public void insert(ChainItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        hashVal %= sizeArr;
        if (hashArray[hashVal] == null) {
            hashArray[hashVal] = new ChainItemList();
        }
        for (int i = 0; i < hashArray[hashVal].getList().size(); i++) {
            if (hashArray[hashVal].getList().get(i).equals(nonItem)){
                hashArray[hashVal].getList().set(i,item);
                return;
            }
        }
        hashArray[hashVal].addItem(item);
    }

    public void display() {
        for (int i = 0; i < sizeArr; i++) {
            if (hashArray[i] != null){
                for (int j = 0; j < hashArray[i].getList().size(); j++) {
                    System.out.print(hashArray[i].getList().get(j).getKey() + " ");
                }
                System.out.println();
            }
            else System.out.println("element is null");
        }
    }

    public ChainItem find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            for (int j = 0; j < hashArray[hashVal].getList().size(); j++) {
                if (hashArray[hashVal].getList().get(j).getKey() == key){
                    return hashArray[hashVal].getList().get(j);
                }
            }
            hashVal %= sizeArr;
        }
        return null;
    }

    public ChainItem delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            for (int j = 0; j < hashArray[hashVal].getList().size(); j++) {
                if (hashArray[hashVal].getList().get(j).getKey() == key){
                    ChainItem temp = hashArray[hashVal].getList().get(j);
                    hashArray[hashVal].getList().set(j, nonItem);
                    return temp;
                }
            }
            hashVal %= sizeArr;
        }
        return null;
    }
//
//    public void display() {
//        for (int i = 0; i < sizeArr; i++) {
//            if (hashArray[i] != null) System.out.println(hashArray[i].getKey());
//            else System.out.println("element is null");
//        }
//    }
}
