package hashTable;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.trimToSize();

        getPrime(3);

//        Person p = new Person("Bob");
//        Person p1 = new Person("Mike");
//        if (p.equals(p1)) System.out.println("true");
//        else System.out.println("false");
//
//        System.out.println(p.hashCode());
//        System.out.println(p1.hashCode());
    }

    public static int getPrime(int min) {
        for (int i = min + 1; true; i++) {
            if (isPrime(i)) return i;
        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; (j * j <= n); j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}
