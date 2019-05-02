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

//    public ChainItem find(int key) {
//        int hashVal = hashFunc(key);
//        int secondHashVal = secondHashFunc(key);
//        while (hashArray[hashVal] != null) {
//            if (hashArray[hashVal].getKey() == key) {
//                return hashArray[hashVal];
//            }
//            hashVal += secondHashVal;
//            hashVal %= sizeArr;
//        }
//        return null;
//    }
//
//    public ChainItem delete(int key) {
//        int hashVal = hashFunc(key);
//        int secondHashVal = secondHashFunc(key);
//        while (hashArray[hashVal] != null) {
//            if (hashArray[hashVal].getKey() == key) {
//                ChainItem temp = hashArray[hashVal];
//                hashArray[hashVal] = nonItem;
//                return temp;
//            }
//            hashVal += secondHashVal;
//            hashVal %= sizeArr;
//        }
//        return null;
//    }
//
//    public void display() {
//        for (int i = 0; i < sizeArr; i++) {
//            if (hashArray[i] != null) System.out.println(hashArray[i].getKey());
//            else System.out.println("element is null");
//        }
//    }
}
