package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("File name " + f1.getName());
        p("Path " + f1.getPath());
        p("Absolut path " + f1.getAbsolutePath());
        p("Parent catalog " + f1.getParent());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canRead() ? "availible for reading" : "not availible for reading");
        p(f1.isDirectory() ? "is catalog" : "isn't catalog");
        p(f1.isFile() ? "is usual file" : "can be named chanal");
        p(f1.isAbsolute() ? "is absolute" : "isn't absolute");
        p("Last chenge in the file " + f1.lastModified());
        p("Size " + f1.length() + " byte");
    }
}
