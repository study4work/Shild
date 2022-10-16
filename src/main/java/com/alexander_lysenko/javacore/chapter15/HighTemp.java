package main.java.com.alexander_lysenko.javacore.chapter15;

public class HighTemp {
    private int hTemp;

    HighTemp(int ht) {hTemp = ht;}

    //возвратить тру, если вызывающий объект типа HighTemp
    //имеет такуюже температуру , как и объекта ht2
    boolean sameTemp (HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }
    boolean lessThanTemp (HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
