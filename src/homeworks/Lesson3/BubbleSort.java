package homeworks.Lesson3;

public class BubbleSort {

    static int[] sort(int[] array) {
        boolean flag = true;
        int i = 0;
        while(flag) {
            flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            ++i;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 66, 0, 9, 101};

        array = sort(array);

        for (var x : array) {
            System.out.println(x + " ");
        }
    }
}
