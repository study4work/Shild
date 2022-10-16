package main.java.com.alexander_lysenko.javacore.chapter15.constructorRefDemo;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        //создать ссылку на конструктор типа MyClass
        //метод func из интерфейса MyFunc принимает аргумент
        //поэтому оператор new обращается к параметризированному конструктору
        //класса MyClass ,а не к конструктору по умолчанию

        MyFunc myClassCons = MyClass::new;

        //создать экземпляр класса по ссылке на его конструктор
        MyClass mc = myClassCons.func(100);
        System.out.println("value val in jobject mc is: " + mc.getVal());
    }
}
