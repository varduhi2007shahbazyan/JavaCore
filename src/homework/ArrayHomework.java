package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        // Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of " + n + ": " + count);
        //Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        int place;
        for (int i = 0; i < 5; i++) {
            int j = 9 - i;

            place = numbers2[i];
            numbers2[i] = numbers2[j];
            numbers2[j] = place;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int count3 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            boolean seebefore = false;

            for (int j = 0; j < i; j++) {
                if (numbers3[i] == numbers3[j]) {
                    seebefore = true;
                    break;
                }
            }

            if (seebefore == false) {
                for (int k = i + 1; k < numbers3.length; k++) {
                    if (numbers3[i] == numbers3[k]) {
                        count3++;
                        break;
                    }
                }
            }
        }
        System.out.println("Repeated numbers count: " + count3);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int count4 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' || chars[i] == 'է' || chars[i] == 'ը' || chars[i] == 'ի' || chars[i] == 'ո' || chars[i] == 'օ')
                count4++;
        }
        System.out.println("Vowels count: " + count4);

        //Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը
        int[] numbersbonus1 = {15, 15, 9, 7, 4};

        int firstMax = numbersbonus1[0];
        int secondMax = numbersbonus1[0];

        for (int i = 1; i < numbersbonus1.length; i++) {
            if (numbersbonus1[i] > firstMax) {
                secondMax = firstMax;
                firstMax = numbersbonus1[i];
            } else if (numbersbonus1[i] < firstMax &&
                    (secondMax == firstMax || numbersbonus1[i] > secondMax)) {
                secondMax = numbersbonus1[i];
            }
        }

        System.out.println("Second maximum: " + secondMax);

        //Bonus 2 — Հեռացնել կրկնվող թվերը
        int[] numbersbonus2 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};
        for (int i = 0; i < numbersbonus2.length; i++) {
            boolean seebefore2 = false;
            for (int j = 0; j < i; j++) {
                if (numbersbonus2[i] == numbersbonus2[j]) {
                    seebefore2 = true;
                    break;
                }
            }
            if (seebefore2 == false) {
                System.out.print(numbersbonus2[i] + " ");
            }
        }
        System.out.println();

        //Bonus 3 — Գտնել ամենաշատ կրկնվող թիվը
        int[] numbersbonus3 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
        int number = numbersbonus3[0];
        int maxcountbonus3 = 0;
        for (int i = 0; i < numbersbonus3.length; i++) {
            int countbonus3 = 0;
            boolean seebefore3 = false;
            for (int j = 0; j < numbersbonus3.length; j++) {
                if (numbersbonus3[i] == numbersbonus3[j]) {
                    countbonus3++;
                }
            }
            if (countbonus3 > maxcountbonus3) {
                maxcountbonus3 = countbonus3;
                number = numbersbonus3[i];
            }
        }
        System.out.println("Most frequent number: " + number);
        System.out.println("Count: " + maxcountbonus3);
    }
}