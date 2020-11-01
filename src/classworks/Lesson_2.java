package classworks;

public class Lesson_2 {

    public static void main(String[] args) {
        int[] array = {12, 8, 3, 4, 16, 1};
        for (int i = 0; i < array.length; i++) {
            if((array[i] & (array[i] - 1)) == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
