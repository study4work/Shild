package main.java.com.alexander_lysenko.javacore.chapter15;

public class LambdasAsArgumentsDemo {
    //первый параметр этого метода имеет тип функционального интерфейса
    //следовательно ему можно передать ссылку на любой экземпляр
    //этого интерфейса, включая экземпляр, создаваемый в лямбда выражении
    //А второй параметр обозначает обрабатываемую символьную строку

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda - expression increase efficiency of Java";
        String outStr;

        System.out.println("Beginner string: " + inStr);

        //ниже приведено просто лямбда выражение,преобразующее
        //в верхний регистр букв все символы исходной строки
        //перевадаемый в метод stringOp();
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("This string in upper case: " + outStr);

        //здесь передается блочное лямбда-выражение, удаляющее
        //пробелы из сиходной строки
        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result = result + str.charAt(i);
                }
            }
            return result;
        },inStr);
        System.out.println("This string with no whitespaces: " + outStr);

        //Конечно можно передать и экземпялр интерфейса stingfunc
        // созданный в предыдущем лямбда выражении. Например после
        //следующего объявления ссылка revers делается на экземпляр интерфейса stringfunc

        StringFunc revers = str -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Revers string: " + stringOp(revers, inStr));
    }
}
