package main.java.com.alexander_lysenko.javacore.chapter15;

public class InstanceMethWithObjectRefDemo {
    //Метод возвращает количество экземпляров объекта
    //найденых по критериям, задаваемым параметром
    //функионального интерфеса Myfunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for(int i =0; i < vals.length; i++) {
            if(f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count = 0;

        HighTemp[] weekDayHighs = {new HighTemp(90), new HighTemp(89), new HighTemp(88),
                new HighTemp(87), new HighTemp(89), new HighTemp(85), new HighTemp(89), new HighTemp(83)};
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Days with temp 89: " + count);

        HighTemp[] weekDayHighs2 = {new HighTemp(90), new HighTemp(89), new HighTemp(88),
                new HighTemp(87), new HighTemp(-2), new HighTemp(85), new HighTemp(32), new HighTemp(83)};
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(86));
        System.out.println("Days with temp 86: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Days with temp less 89: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(86));
        System.out.println("Days with temp less 86: " + count);
    }
}
