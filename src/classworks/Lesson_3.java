package classworks;

public class Lesson_3 {

    public static void main(String[] args) {
        //palindrome
        int x = 1234321;
        int xCopy = x;
        int y = 0;
        while (xCopy != 0) {
            y = y * 10 + xCopy % 10;
            xCopy /= 10;
        }
        System.out.println(x == y ? "Yes" : "No");
    }
}
