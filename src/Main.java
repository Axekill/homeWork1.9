import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("задача 2");
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        System.out.println("Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей");
    }

    public static void task3() {
        System.out.println("задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int avg = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
    }

    public static void task4() {
        System.out.println("задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = (char) temp;
        }
        System.out.println(reverseFullName);
    }

}