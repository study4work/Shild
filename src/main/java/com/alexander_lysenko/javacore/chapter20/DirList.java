package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        if(f1.isDirectory()) {
            System.out.println("Catalog");
            String s[] = f1.list();

            for(int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory()) {
                    System.out.println(s[i] + "is directory");
                } else {
                    System.out.println(s[i] + "isn't directory");
                }
            }
        } else {
            System.out.println(dirname + " isn't catalog");
        }
    }
}
