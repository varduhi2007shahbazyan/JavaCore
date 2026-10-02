package homework;

public class Homework1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        if (x > y) {
            System.out.println(x + "-ը" + " մեծ է");
        }
        if (y > x) {
            System.out.println(y + "-ը" + " մեծ է");
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int a = 5;
        int b = 7;
        System.out.println("a + b = " + (a + b));

        System.out.println();

        int n = 3;
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " * " + j + " = " + n * j);
        }
    }
}
