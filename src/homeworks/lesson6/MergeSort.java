package homeworks.lesson6;

import java.util.Arrays;

public class MergeSort {
    private static void mergeArrays(int[] arr, int[] a, int[] b) {
        int k = 0, i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] l = new int[mid];
        int[] r = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l);
        mergeSort(r);

        mergeArrays(arr, l, r);
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 0, 1, -2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
