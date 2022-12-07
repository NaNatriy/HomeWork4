import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1 и 2");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {15, 23, 30};

        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println("Задача 3");
        // reversed arr1
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
            System.out.println(Arrays.toString(arr1));
            // reversed massive 3
            int temb = arr3[i];
            arr3[i] = arr3[arr3.length - i - 1];
            arr3[arr3.length - i - 1] = temb;
            System.out.println(Arrays.toString(arr3));
        }
        // reversed arr2
        for (int i = 0; i < arr2.length / 2; i++) {
            double temp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
            System.out.println(Arrays.toString(arr2));
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {

                System.out.println(arr1[i]);
            } else {
                arr1[i]++;
                System.out.println(arr1[i]);
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        System.out.println("Задача 5");
        int[] arr = generateRandomArray();
        int sum = IntStream.of(arr).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        int middleArr = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + middleArr + " рублей");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int[] arr = generateRandomArray();
        int maxArr = 0;
        //MAX
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        int minArr = maxArr;
        //MIN
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int[] arr = generateRandomArray();
        int sum = IntStream.of(arr).sum();
        int middleArr = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleArr + " рублей");
    }


    public static void task8() {
        System.out.println("Задача 8");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] lastName = new char[reverseFullName.length];
        for (int i = 0; i < reverseFullName.length; i++) {
            lastName[i] = reverseFullName[reverseFullName.length - i - 1];
        }
        System.out.println(Arrays.toString(lastName));
    }
}

