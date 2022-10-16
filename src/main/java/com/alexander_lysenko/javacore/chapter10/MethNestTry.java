package main.java.com.alexander_lysenko.javacore.chapter10;

public class MethNestTry {
    static void nesttry(int a) {
        try { // вложенный блок try
                /*
                Если указан один аргумент командной строки,
                то исключение в связи с делением на ноль,
                будет сгенерированно в следующем коде
                 */
            if (a == 1) {
                a = a / (a - a); // деление на ноль
                 /*
                 Если указано два аргумента командной строки,
                 то генерируется исключение в связи с выходом за пределы массива
                  */
                if (a == 2) {
                    int[] c = {1};
                    c[42] = 99; //здесь генерируется исключение в связи с выходом за пределы массива
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
        /*
        если не указаны аргументы командной строки,
         в следующем операторе будет сгенерированно исключени
        деления на ноль
         */
            int b = 42 / a;
            System.out.println("a = :" + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль " + e);
        }
    }
}
