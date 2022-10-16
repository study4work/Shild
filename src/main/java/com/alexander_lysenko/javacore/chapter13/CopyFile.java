package main.java.com.alexander_lysenko.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
    int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        //сначала убедиться,что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Using: CopyFile from-to");
            return;
        }
        // копировать файл
        try {
            //попытка открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error input-output: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Closing error input file ");
            } try {
                if (fout != null ) fout.close();
            } catch (IOException e2) {
                System.out.println("Closing error output file ");
            }
        }


    }
}
