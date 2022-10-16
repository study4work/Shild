package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        console = System.console();
         if (console == null) return;

         str = console.readLine("Enter the string: ");
         console.printf("Your string: ", str);
    }
}
