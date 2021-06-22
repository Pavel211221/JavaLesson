package HomeWork2;

public class MainClass2 {
    public static void main(String[] args) {

        System.out.println(getSum(-5, -8));
        System.out.println(getSum(3, 7));
        System.out.println(getSum(10, 17));


        check(-10);
        check(5);


        System.out.println(checkNumber(-8));
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(8));


        сycle("Java learn", 4);


        System.out.println(leapYear(400));
        System.out.println(leapYear(800));
        System.out.println(leapYear(200));
        System.out.println(leapYear(300));
        System.out.println(leapYear(16));
        System.out.println(leapYear(20));

    }

    /**Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
     * лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     * в противном случае – false.
     * */
    public static boolean getSum(int a, int b) {
        return 10 <= a + b && a + b <= 20;
    }


    /**Написать метод, которому в качестве параметра передается целое число, метод должен
     *  напечатать в консоль, положительное ли число передали или отрицательное.
     *  Замечание: ноль считаем положительным числом.
     * */
    public static void check(int x) {
        if (x < 0) {
            System.out.println("Отрицательное значение");
        }
        System.out.println("Положительнное значение");
    }


    /**Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false
     * если положительное.
     * */
    public static boolean checkNumber(int x) {
        return x < 0;
    }


    /**Написать метод, которому в качестве аргументов передается строка и число,
     *  метод должен отпечатать в консоль указанную строку, указанное количество раз
     * */
    public static void сycle(String a, int i) {
        while (i > 0) {
            System.out.println(a);
            i-=1;}
    }


    /**Написать метод, который определяет, является ли год високосным, и  возвращает
     *  boolean (високосный - true, не високосный - false). Каждый 4-й год является
     *  високосным, кроме каждого 100-го, при этом каждый 400-й – високосный     *
     * */
    public static boolean leapYear(int i){
        if (i % 400 == 0) {
            return true;
        }

        if ( i % 100 == 0) {
            return false;
        }
        if ( i % 4 == 0){
            return true;
        }
        return false;
    }
}
