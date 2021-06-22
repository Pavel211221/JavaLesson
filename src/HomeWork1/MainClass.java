package HomeWork1;

public class MainClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers(9,12);
    }

    public  static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = 12;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Красный");
        }else if (0 < value && value <= 100){
            System.out.println("Желтый");
        }else if(value>100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a,int b){
        if (a>=b) {
            System.out.println(a+" >= "+b);
        }else if (a<b){
            System.out.println(a+" < "+b);
        }
    }
}
