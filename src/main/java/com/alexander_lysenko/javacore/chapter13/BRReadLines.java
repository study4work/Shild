package main.java.com.alexander_lysenko.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Чтение символьных строк с консоли используя BufferReader
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //Создать поток ввода типа BufferReader
        //используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String srt;
        System.out.println("Введите строки текста");
        System.out.println("Введите 'стоп' для выхода");

        do {
            srt = br.readLine();
            System.out.println(srt);
        } while (!srt.equals("стоп"));
    }
}
