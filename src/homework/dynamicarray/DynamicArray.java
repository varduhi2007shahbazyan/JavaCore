package homework.dynamicarray;

public class DynamicArray {
    // Սա մեր հիմնական զանգվածն է,
    // որտեղ պահելու ենք ավելացվող էլեմենտները։
    private int[] array = new int[10];

    // Սա մեր զանգվածում ավելացված
    // էլեմենտների քանակն է։
    private int size = 0;


    // Ավելացնել նոր էլեմենտ։
    // 1. Ստուգել՝ արդյոք զանգվածում ազատ տեղ կա։
    // 2. Եթե տեղ չկա, կանչել extend() մեթոդը։
    // 3. Ավելացնել նոր էլեմենտը։
    // 4. Մեծացնել size-ի արժեքը։
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }


    // Մեծացնել զանգվածի տարողությունը։
    // 1. Ստեղծել հին զանգվածից 10 էլեմենտով
    //    ավելի մեծ նոր զանգված։
    // 2. Հին զանգվածի բոլոր էլեմենտները
    //    պատճենել նոր զանգվածի մեջ։
    // 3. array փոփոխականը կապել
    //    նոր զանգվածի հետ։
    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    // Վերադարձնել տրված ինդեքսի էլեմենտը։
    // Եթե index-ը 0-ից մինչև size - 1
    // միջակայքում է, վերադարձնել էլեմենտը։
    // Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return -1;
    }


    // Տպել զանգվածում ավելացված
    // բոլոր էլեմենտները։
    // Տպել միայն size քանակով էլեմենտ։
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
