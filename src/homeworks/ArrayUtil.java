package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
// Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

// Խնդիր 2 — Տպել առաջին էլեմենտը
        System.out.println("First element: " + numbers[0]);
        System.out.println();

// Խնդիր 3 — Տպել վերջին էլեմենտը
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        System.out.println();

//Խնդիր 4 — Տպել զանգվածի երկարությունը
        System.out.println("Array length: " + numbers.length);
        System.out.println();

//Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println();

//Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 == 1) {
            System.out.println("Middle element: " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Middle elements: " + numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        }
        System.out.println();

//Խնդիր 7 — Հաշվել զույգ թվերի քանակը
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println();

//Խնդիր 8 — Հաշվել կենտ թվերի քանակը
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println();

//Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println();

//Խնդիր 10 — Հաշվել միջին թվաբանականը
        double sumAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumAverage += numbers[i];
        }
        double average = sumAverage / numbers.length;
        System.out.println("Average: " + average);
        System.out.println();

//Bonus 1 — Գտնել ամենամեծ թիվը
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println();

//Bonus 2 — Հաշվել դրական և բացասական թվերը
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive += 1;
            } else if (numbers[i] < 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println();

//Bonus 3 — Տպել զանգվածը հակառակ հերթականությամբ
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
