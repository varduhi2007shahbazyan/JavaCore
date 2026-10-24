package homework;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        //Խնդիր 1 — Տպել բոլոր սիմվոլները

        System.out.println(chars);

        System.out.println();

        //Խնդիր 2 — Հաշվել սիմվոլների քանակը

        System.out.println("Characters count: " + chars.length);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);

        System.out.println();

        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը

        char c = 'a';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Character 'a' count: " + count);
        } else {
            System.out.println(0);
        }

        System.out.println();

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը

        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'e' || chars[i] == 'u' ||
                    chars[i] == 'A' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'E' || chars[i] == 'U'
            ) {
                vowelsCount++;
            }
        }

        System.out.println("Vowels count: " + vowelsCount);

        System.out.println();

        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը

        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z' ||
                    chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] != 'a' && chars[i] != 'A' &&
                        chars[i] != 'i' && chars[i] != 'I' &&
                        chars[i] != 'u' && chars[i] != 'U' &&
                        chars[i] != 'e' && chars[i] != 'E' &&
                        chars[i] != 'o' && chars[i] != 'O') {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Consonants count: " + consonantsCount);

        System.out.println();

        //Խնդիր 6 — Հաշվել բացատների քանակը
        int spacesCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spacesCount++;
            }
        }
        if (spacesCount > 0) {
            System.out.println("Spaces count: " + spacesCount);
        } else {
            System.out.println("Spaces count: " + 0);
        }
        System.out.println();

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
        char temp;
        for (int i = 0; i < (chars.length) / 2; i++) {
            int j = chars.length - 1 - i;

            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println();
        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը
        char[] upper = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        char[] lower = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        for (int i = 0; i < upper.length; i++) {
            if (upper[i] >= 'a' && upper[i] <= 'z') {
                upper[i] = (char) (upper[i] - 'a' + 'A');
            }
        }
        System.out.print("Uppercase: ");
        for (int i = 0; i < upper.length; i++) {
            System.out.print(upper[i]);
        }

        System.out.println();


        for (int i = 0; i < lower.length; i++) {
            if (lower[i] >= 'A' && lower[i] <= 'Z') {
                lower[i] = (char) (lower[i] - 'A' + 'a');
            }
        }
        System.out.print("Lowercase: ");
        for (int i = 0; i < lower.length; i++) {
            System.out.print(lower[i]);
        }

        System.out.println();
        System.out.println();

        //Խնդիր 9 — Փոխարինել տրված սիմվոլը
        char[] chars9 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars9.length; i++) {
            if (chars9[i] == oldChar) {
                chars9[i] = newChar;
            }
        }
        for (int i = 0; i < chars9.length; i++) {
            System.out.print(chars9[i]);
        }

        System.out.println();
        System.out.println();
        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] chars10 = {'h', 'e', 'l', 'l', 'o'};
        boolean isPalindrome = true;
        for (int i = 0; i < chars10.length / 2; i++) {
            if (chars10[i] != chars10[chars10.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);
        System.out.println();

        //Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] charsBonus1 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int index = -1;
        for (int i = 0; i < charsBonus1.length; i++) {
            if (charsBonus1[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("First index: " + index);
        System.out.println();

        //Bonus 2 — Համեմատել երկու char զանգված
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};
        boolean areEqual = true;
        if (first.length != second.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are equal: " + areEqual);
        System.out.println();

        //Bonus 3 — Հեռացնել կրկնվող սիմվոլները
        char[] charsBonus3 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};
        for (int i = 0; i < charsBonus3.length; i++) {
            boolean seebefore = false;
            for (int j = 0; j < i; j++) {
                if (charsBonus3[i] == charsBonus3[j]) {
                    seebefore = true;
                    break;
                }
            }
            if (seebefore == false) {
                System.out.print(charsBonus3[i] + " ");
            }
        }
    }
}
