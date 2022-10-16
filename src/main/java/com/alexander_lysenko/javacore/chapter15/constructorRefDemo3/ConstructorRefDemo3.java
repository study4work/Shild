package main.java.com.alexander_lysenko.javacore.chapter15.constructorRefDemo3;

public class ConstructorRefDemo3 {
    //Фабричный метод для объектов разных классов.
    //У каждого класса должен быть свой конструктор, принимающий один параметр типа Т
    //А параметр типа R обозначает тип создоваемого объекта
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        //Создать ссылку на коснтруктор класса MyClass
        //В данном случае оператор new обращается к конструктору
        // принимающему аргумент
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass::new;
        MyClass<Double> mc = myClassFactory(myClassCons, 100.2);
        System.out.println("Value in object mc is: " + mc.getVal());

        //Создать экземпляр другого класса используя метод myClassFactory
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "String");
        System.out.println("Value in mc2 is: " + mc2.getVal());
    }
}
