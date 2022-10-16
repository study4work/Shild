package main.java.com.alexander_lysenko.javacore.chapter15.constructorRefDemo3;

public class MyClass<T> {
    private T val;

    MyClass(T v) { val=v;}
    MyClass() { val = null;}
    T getVal() { return val;}
}
