import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random  = new Random();
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 100000;
        }
        return array;
    }
    public static void task1() {
        int[] array = generateRandomArray();
        int salaryAll = 0;

        for(int i : array) {
            salaryAll += i;
        }
        System.out.println("Сумма трат за месяц составила " + salaryAll + " рублей");
    }

    public static void task2() {
        int[] array = generateRandomArray();
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i : array) {
            if(i > maxValue) {
                maxValue = i;
            }
            if(i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue
                + " рублей. Максимальная сумма трат за день составила " + maxValue + " рублей");
    }

    public static void task3() {
        int[] array = generateRandomArray();
        int salaryAll = 0;
        double avgValue;
        int days = 30;

        for (int i : array) {
            salaryAll += i;
        }
        avgValue = (double) salaryAll / days;
        System.out.println("Средняя сумма трат за месяц составила " + avgValue + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}