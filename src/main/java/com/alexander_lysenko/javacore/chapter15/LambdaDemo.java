package main.java.com.alexander_lysenko.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // объявить ссылку на функциональный интерфес

        //Здесь лямбда выражение просто является константным выражением.
        //Когда оно присваивается ссылочной переменной myNum, получается
        //экземпляр класса, в котором лямбда выражение реализует
        //метод getValue() из функцианального интерфеса MyNUmber

        myNum = () -> 123.45;

        //вызвать метод getValue(), предоставляемый
        //присвоенным ранее лямбда-выражением

        System.out.println("Constant number: " + myNum.getValue());

        //более сложное выражение

        myNum = () -> Math.random() * 100;

        //Вызвыаем лямбда-выражение из предыдущей строки
        System.out.println("Random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());

        //Лямбда-выражение должно быть совместимо с абстрактным методом,
        //определяемым в функциональном интерфейсе. Поэтому следующая строка кода ошибочна:

        // myNum = () -> "123"; //Error
    }
}
