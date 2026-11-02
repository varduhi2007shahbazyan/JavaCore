
package homework.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
//Խնդիր 1 — add(int value)
        DynamicArray da = new DynamicArray();

        da.add(5);
        da.add(10);
        da.add(15);

        da.print();
        System.out.println();

//Խնդիր 2 — extend()
        DynamicArray da2 = new DynamicArray();

        for (int i = 1; i <= 15; i++) {
            da2.add(i);
        }
        da2.print();

        System.out.println();
//Խնդիր 3 — getByIndex(int index)
        DynamicArray da3 = new DynamicArray();

        da3.add(10);
        da3.add(20);
        da3.add(30);

        System.out.println(da3.getByIndex(0));
        System.out.println(da3.getByIndex(2));
        System.out.println(da3.getByIndex(5));
        System.out.println(da3.getByIndex(-1));

        System.out.println();
//Խնդիր 4 — print()
        DynamicArray da4 = new DynamicArray();

        da4.add(4);
        da4.add(8);
        da4.add(12);

        da4.print();

        System.out.println();
//4. DynamicArrayDemo — Թեստավորում

//Թեստ 1 — Ավելացնել էլեմենտներ

        DynamicArray da5 = new DynamicArray();

        da5.add(10);
        da5.add(20);
        da5.add(30);
        da5.add(40);
        da5.add(50);

        da5.print();

        System.out.println();
//Թեստ 2 — Զանգվածի մեծացում

        DynamicArray da6 = new DynamicArray();

        for (int i = 1; i <= 15; i++) {
            da6.add(i);
        }
        da6.print();

        System.out.println();
//Թեստ 3 — Կրկնակի մեծացում

        DynamicArray da7 = new DynamicArray();

        for (int i = 1; i <= 25; i++) {
            da7.add(i);
        }
        da7.print();

        System.out.println();
//Թեստ 4 — Ինդեքսով ստանալ էլեմենտ

        DynamicArray da8 = new DynamicArray();

        da8.add(10);
        da8.add(20);
        da8.add(30);

        System.out.println(da8.getByIndex(0));
        System.out.println(da8.getByIndex(2));
        System.out.println(da8.getByIndex(-1));
        System.out.println(da8.getByIndex(5));
        System.out.println();
        DynamicArray da9 = new DynamicArray();

        System.out.println(da9.getByIndex(0));
    }
}
