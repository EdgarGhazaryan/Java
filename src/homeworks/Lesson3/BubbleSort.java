package homeworks.Lesson3;

public class BubbleSort {

    static int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 66, 0, 9, 101};

        array = BubbleSort(array);

        for (var x : array) {
            System.out.println(x + " ");
        }
    }
}
