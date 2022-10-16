package main.java.com.alexander_lysenko.javacore.chapter15;

public class MetodRefDemo {
    //в этом методе функциональный интерфейс указывается в качестве
    //типа первого параметра. Следовательно емуможет быть передан
    //любой экземпляр этого интерфейса, включая и ссылку на метод
    static String strinOp(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions increase effectly of java";
        String outStr;
        //Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = strinOp(MyStringOps::strReverse, inStr);
        System.out.println("String without changes: " + inStr);
        System.out.println("Changed string: " + outStr);
    }
}
