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

            if(!isBracket(current)) {
                continue;
            }

            if (current.equals('(') || current.equals('{') || current.equals('[')) {
                stack.push(current);
            } else if (stack.empty()) {
                return false;
            } else if(isAnotherBracket(stack.peek(), current)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean isBracket(Character ch) {
        return (ch.equals('(') || ch.equals(')') ||ch.equals('{') ||ch.equals('}') ||ch.equals('[') ||ch.equals(']'));
    }

    private static boolean isAnotherBracket(Character ch1, Character ch2) {
        if (ch1.equals('(') && ch2.equals(')'))
            return true;

        if (ch1.equals('[') && ch2.equals(']'))
            return true;

        if (ch1.equals('{') && ch2.equals('}'))
            return true;

        return false;
    }
}
