import java.util.Arrays;

public class Main {

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installOS(int os, int year) {
        boolean howOs = os == 1;
        boolean howYear = year >= 2015;
        choiceVersion(howOs, howYear);
    }

    public static void choiceVersion(boolean os, boolean year) {
        if (!os && year) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os && year) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!os && !year) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }


    public static int calculationDayDelivery(int dist) {
        if (dist <= 20) {
            return 1;
        } else if (dist > 20 && dist <= 60) {
            return 2;
        } else if (dist > 60 && dist <= 100) {
            return 3;
        } else {
            return 7;
        }


    }

    public static void findingDuplicates(String a) {
        char[] letters = a.toCharArray();
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.println("Дублируется символ " + letters[i]);
                return;
            }
        }
        System.out.println("Дублей нет!");

    }

    public static void permutationElements(int[] elements) {
        for (int i = 0, j = elements.length - 1; i < j; ++i, --j) {
            int tmp = elements[i];
            elements[i] = elements[j];
            elements[j] = tmp;
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

    public static void printSumElementsAndCalcAverige(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = calculationAverige(sum);
        printSumElementsAndCalcAverigeResult(sum, average);

    }

    public static double calculationAverige(double sum) {
        double averageValue = sum / 30;
        return averageValue;
    }

    public static void printSumElementsAndCalcAverigeResult(double sum, double average) {
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }


    public static void main(String[] args) {

        //Exercise 1

        int year = 1988;
        checkYear(year);


        //Exercise 2

        int yearPhone = 2014;
        int os = 1;
        installOS(os, yearPhone);


        //Exercise 3

        int distant = 101;
        System.out.println("Потребуется дней: " + calculationDayDelivery(distant));

        //Exercise 4

        String letter = "aabccddefgghiijjkk";
        findingDuplicates(letter);

        //Exercise 5

        int[] arr = {3, 2, 1, 6, 5};
        permutationElements(arr);
        System.out.println(Arrays.toString(arr));


        //Exercise 6


        int[] array = generateRandomArray();
        printSumElementsAndCalcAverige(array);


    }
}