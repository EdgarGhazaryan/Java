package classworks;

public class Lesson_2 {

    public static void main(String[] args) {
        int[] array = {12, 8, 3, 4, 16, 1};
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            while (current % 2 == 0) {
                current /= 2;
            }
            if (current == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
