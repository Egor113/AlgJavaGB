package task1.stack;

import java.io.IOException;

public class MainStack {
    public static void main(String[] args) throws IOException {
        String st = "12345";
        Stack stack = new Stack(st.length());
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            System.out.println("Ввели в стек символ: " + ch);
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            System.out.println("Выввели из стека символ: " + stack.pop());
        }
    }
}
