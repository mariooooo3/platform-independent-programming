package Integrate_Data_Structures_and_Iterators;

import java.util.Stack;

public class Prb1 {
    public static void main(String[] args) {
        String msg = "-+u+s+c-+e+r+t-+a+i-+s+t+r-+y+u-+l+e+s";

        System.out.println("\nTask1");
        for (int i = 0; i < msg.length(); i++) {
            System.out.println(msg.charAt(i) + "\n");
        }

        System.out.println("\nTask2");
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '+' || msg.charAt(i) == '-')
                System.out.println(msg.charAt(i));
        }

        System.out.println("\nTask3");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '+')
                stack.push(msg.charAt(i + 1));
            else if (msg.charAt(i) == '-')
                if (!stack.isEmpty())
                    stack.pop();
        }
        System.out.println("Stiva finală: " + stack);

        System.out.println("\nTask4");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
