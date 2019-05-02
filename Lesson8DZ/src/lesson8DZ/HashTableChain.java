package lesson8DZ;

public class HashTableChain {
    private ChainItemList[] hashArray;
    private int sizeArr;
    private ChainItem nonItem;

    public HashTableChain(int size) {
        this.sizeArr = size;
        this.hashArray = new ChainItem[sizeArr];
        nonItem = new ChainItem(-1);
    }

    public int hashFunc(int key) {
        return key % sizeArr;
    }

    public int secondHashFunc(int key) {
        return 33 - key % 33;
    }

    public ChainItem find(int key) {
        int hashVal = hashFunc(key);
        int secondHashVal = secondHashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            hashVal += secondHashVal;
            hashVal %= sizeArr;
        }
        return null;
    }

    public void insert(ChainItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        int secondHashVal = secondHashFunc(key);
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            hashVal += secondHashVal;
            hashVal %= sizeArr;
        }
        hashArray[hashVal] = item;
    }

    public ChainItem delete(int key) {
        int hashVal = hashFunc(key);
        int secondHashVal = secondHashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                ChainItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            hashVal += secondHashVal;
            hashVal %= sizeArr;
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < sizeArr; i++) {
            if (hashArray[i] != null) System.out.println(hashArray[i].getKey());
            else System.out.println("element is null");
        }
    }
}
