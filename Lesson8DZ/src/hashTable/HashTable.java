package hashTable;

public class HashTable {
    private DataItem[] hashArray;
    private int sizeArr;
    private DataItem nonItem;

    public HashTable(int size) {
        this.sizeArr = size;
        this.hashArray = new DataItem[sizeArr];
        nonItem = new DataItem(-1);
    }

    public int hashFunc(int key) {
        return key % sizeArr;
    }

    public int secondHashFunc(int key) {
        return 33 - key % 33;
    }

    public DataItem find(int key) {
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
    //3 -> 5 -> 7 ->11
    //5 -> 1 and 5
    //6 -> 1 and 2 and 3 and 6
    private int getPrime(int min) {
        for (int i = min + 1; true; i++) {
            if (isPrime(i)) return i;
        }
    }

    private boolean isPrime(int n) {
        for (int j = 2; (j * j <= n); j++) {
            if (n % j == 0) return false;
        }
        return true;
    }

    public void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        int secondHashVal = secondHashFunc(key);
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            hashVal += secondHashVal;
            hashVal %= sizeArr;
        }
        hashArray[hashVal] = item;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunc(key);
        int secondHashVal = secondHashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal];
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
