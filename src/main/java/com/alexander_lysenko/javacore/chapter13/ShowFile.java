package main.java.com.alexander_lysenko.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //сначала убедимся,что имя файла указано
        if (args.length != 1) {
            System.out.println("Using file : ShowFile file_name");
            return;
        }

        //Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open the file");
            return;
        }

        //Теперь файл открыт и готов к чтению
        //Далее из него читаются символы до тех пор,
        //Пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if(i != -1) System.out.println((char)i);
            } while (i != -1) ;
        } catch (IOException e ) {
            System.out.println("error readint the file");
        }

        //Закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("error closing the file");
        }
    }
}
