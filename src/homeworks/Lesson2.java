package homeworks;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Task 1. Create an array and fill it with 2 number");

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 2;
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Task 2. Create an array and fill it with numbers from 1:1000.");

        int[] array2 = new int[1000];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Task 3. Create an array and fill it with odd numbers from -20:20");

        int[] array3 = new int[20];
        int index= 0;
        for (int i = -19; i <= 19; i += 2) {
            array3[index++] = i;
            System.out.print(array3[index - 1] + " ");
        }
        System.out.println("\n");

        System.out.println("Task 4. Create an array and fill it. Print all elements which can be divided by 5.");

        int[] array4 = new int[]{-50, 1, 156, 180, 25, 6, 96};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Task 5. Create an array and fill it. Print all elements which are between 24.12 and 467.23.");

        double[] array5 = new double[]{6.21, 695.01, -6.2, 100.95, 29.64, 99.99};
        for (int i = 0; i < array5.length; i++) {
            if(array5[i] >= 24.12 && array5[i] <= 467.23) {
                System.out.print(array5[i] + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Task 6. Create an array and fill it. Print count of elements which can be divided by 2.");

        int[] array6 = new int[]{-50, 1, 156, 180, 25, 6, 96};
        int count = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + "\n");

        System.out.println("Task 7. Given an integer, 0 < N < 21, print its first 10 multiples.");

        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (i * n));
        }
    }
}
