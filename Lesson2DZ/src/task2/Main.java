package task2;

import task1.stack.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите исходную строку");
        String str = putString();
        while (!str.equals("")){
            System.out.println("Перевернутая строка: " + reverse(str));
            System.out.println("Введите исходную строку");
            str = putString();
        }

    }
    public static String putString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static String reverse(String str){
        String reverseStr = "";
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()){
            reverseStr += stack.pop();
        }
        return reverseStr;
    }
}
