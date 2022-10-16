package main.java.com.alexander_lysenko.javacore.chapter15.constructorRefDemo;

 class MyClass {
    private int val;

    //Этот конструктор принимает один аргумент
    MyClass(int v) {val = v;}
    //конструктор по умолчанию
    MyClass() {val = 0;}
    int getVal() {return val;}
}
