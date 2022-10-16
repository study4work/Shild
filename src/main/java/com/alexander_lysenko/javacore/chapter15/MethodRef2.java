package main.java.com.alexander_lysenko.javacore.chapter15;

public class MethodRef2 {
    //в этом методе функциональный интерфейс указывается в качестве
    //типа первого параметра. Следовательно ему может быть передан любой
    //экземпляр этого интерфеса , включая ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions increase effectly of Java";
        String outStr;

        //Create object of MystringOps
        MyStringOps strOps = new MyStringOps();
        //теперь ссылка на метод экземпляра strReverse()
        //передается методу stringOp()
        outStr = stringOp(strOps::strReverse1, inStr);
        System.out.println("Beginner string: " + inStr);
        System.out.println("Changed string: " + outStr);
    }
}
