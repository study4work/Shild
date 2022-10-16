package main.java.com.alexander_lysenko.javacore.chapter15.genericMetodRef;

public class GenericMethodRefDemo {
    //в качестве первого параметра этого метода указывается
    // функиональный интерфейс, а в качестве двух других
    //массив и значение - оба типа Т
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {

        Integer[] vals = {1, 2, 3, 4, 4, 2, 3, 5, 3};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("Array vals contains: " + count + " number 4");

        count = myOp(MyArrayOps::countMatching, strs, "Two");
        System.out.println("Array strs contains: " + count + " string Two");
    }
}
