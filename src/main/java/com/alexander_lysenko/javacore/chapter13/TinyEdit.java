package main.java.com.alexander_lysenko.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// простейший текстовый редактор
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        //Создать поток ввода типа BufferReader
        //используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[100];
        System.out.println("Введите текст:");
        System.out.println("Введите 'стоп' для завершения");

        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }

        System.out.println("\nСодержимое вашего файла:");
        //Вывести текстовые строки

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            if (str[i].equals("стоп")) break;
        }
    }

}
