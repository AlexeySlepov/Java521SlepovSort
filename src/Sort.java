import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static int[] massive;
    public static int count;

    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива");
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        massive = new int[count];

        fillArray(massive);
        System.out.println("Исходный массив: " + Arrays.toString(massive));

        bubbleSort(massive);
        System.out.println("Отсортированный массив: " + Arrays.toString(massive));
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    public static void bubbleSort(int[] arrayNums) {
        for (int i = arrayNums.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayNums[j] > arrayNums[j + 1])
                    swap(j, j + 1);
            }
        }
    }

    public static void swap(int first, int second) {
        int temp = massive[first];
        massive[first] = massive[second];
        massive[second] = temp;
    }

}
