import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите размер одномерного массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arrLength - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
