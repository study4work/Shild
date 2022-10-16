package main.java.com.alexander_lysenko.javacore.chapter15.genericMetodRef;

//В этом классе определяется метод countMatching(), возвращающий
//количество элементов в массиве, равных указанному значению.
//Обратите внимание на то, что метод countMatching() является обобщенным
//тогда как класс не является
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for(int i = 0; i < vals.length; i++) {
            if(vals[i] == v) count++;
        }
        return count;
    }
}
