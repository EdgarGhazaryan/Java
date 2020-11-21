package classworks;

import java.util.Arrays;

public class Lesson_6 {
    public static void main(String[] args) {
        int[] a = {0,1,5};
        int[] b = {-2,3,7};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int k = 0, i = 0, j = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                arr[k++] = a[i++];
            }
            else {
                arr[k++] = b[j++];
            }
        }

        while(i < a.length) {
            arr[k++] = a[i++];
        }
        while(j < b.length) {
            arr[k++] = b[j++];
        }

        return arr;
    }
}
