package main.java.com.alexander_lysenko.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {
        dout.writeDouble(98.6);
        dout.writeInt(1000);
        dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.print("Can't open the file " + e);
        } catch (IOException e) {
            System.out.print("IO error" + e);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("Test.dat"))) {
        double d = dis.readDouble();
        int i = dis.readInt();
        boolean b = dis.readBoolean();

            System.out.println(d +" "+ i+ " "+ b);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("IO error" + e);
        }
    }
}
