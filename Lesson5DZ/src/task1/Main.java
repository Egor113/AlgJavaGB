package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(exponentiation(5,3));
    }

    public static int exponentiation(int x, int n){
        if (n == 1) return x;
        return x * exponentiation(x,n-1);
    }
}
