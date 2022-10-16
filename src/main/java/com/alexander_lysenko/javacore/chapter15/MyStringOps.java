package main.java.com.alexander_lysenko.javacore.chapter15;

public class MyStringOps {
    //статический метод изменяющий порядок вызова символов в строке
    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public String strReverse1 (String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
