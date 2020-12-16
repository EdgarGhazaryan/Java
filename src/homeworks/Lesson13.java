package homeworks;

import java.util.Scanner;
import java.util.Stack;

public class Lesson13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(isStringValid(str));
    }

    public static boolean isStringValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character current = str.charAt(i);

            if (current.equals('(') || current.equals('{') || current.equals('[')) {
                stack.push(current);
            } else if (stack.empty()) {
                return false;
            } else if (current.equals(')')) {
                if (!stack.peek().equals('(')) {
                    return false;
                }
                stack.pop();
            } else if (current.equals('}')) {
                if (!stack.peek().equals('{')) {
                    return false;
                }
                stack.pop();
            } else if (current.equals(']')) {
                if (!stack.peek().equals('[')) {
                    return false;
                }
                stack.pop();
            }
        }

        return true;
    }

    private static boolean isBracket(Character ch) {
        return (ch.equals('(') || ch.equals(')') || ch.equals('{') || ch.equals('}') || ch.equals('[') || ch.equals(']'));
    }
}
