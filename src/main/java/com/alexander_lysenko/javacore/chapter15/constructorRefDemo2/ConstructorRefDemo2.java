package main.java.com.alexander_lysenko.javacore.chapter15.constructorRefDemo2;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {

        MyFunc<Integer> myClassCons = MyClass::new;

        MyClass<Integer> mc = myClassCons.func(100);

        System.out.println("Value val in object mc is: " + mc.getVal());
    }
}
