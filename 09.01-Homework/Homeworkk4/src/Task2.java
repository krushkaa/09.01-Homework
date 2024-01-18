
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите размер одномерного массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        // Task 1
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arrLength - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Task 2
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min value in arr: " + min);
        System.out.println("Max value in arr: " + max);
        System.out.println();


        // Task 3
        int minIndex = arr[0];
        int maxIndex = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println();

        // Task 4
        int value = 0;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == 0) {
                value++;
            }
        }
        if (value == 0) {
            System.out.println("Массив не содержит элементов равных 0.");
        } else {
            System.out.println("Количество нулевых элементов = " + value);
        }
        System.out.println();

        // Task 5
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < (arr.length / 2); i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // Task 6
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int increase = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                System.out.println("Массив не возрастающий.");
                break;
            } else {
                increase++;
            }
            if (increase == (arr.length - 1)) {
                System.out.println("Массив возрастающий.");
            }
        }
        System.out.println();

    }
}


