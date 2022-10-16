package main.java.com.alexander_lysenko.javacore.chapter10;

public class FinallyDemo {
    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("В теле метода ProcA()");
            throw new RuntimeException("Демонстрация");
        } finally {
            System.out.println("Блок оператора finally  в методе procA");
        }
    }
    //Возратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("В теле мотода ProcB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB");
        }
    }
    //Выполнить блок try как обычно
    static void procC() {
        try {
            System.out.println("В теле метода ProcC()");
        } finally {
            System.out.println("Блок finally в методе ProcC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " + e);
        }
        procB();
        procC();
    }
}
