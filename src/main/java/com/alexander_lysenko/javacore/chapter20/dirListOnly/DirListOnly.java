package main.java.com.alexander_lysenko.javacore.chapter20.dirListOnly;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dir = "/java";
        File f1 = new File(dir);
        FilenameFilter only = new OnlyExt("html");
        String s[] = f1.list(only);

        for(int i =0; i<s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
