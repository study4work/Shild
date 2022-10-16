package main.java.com.alexander_lysenko.javacore.chapter29;

public class NamePhone {
    private String name;
    private String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "NamePhone{" +
                "name='" + name + '\'' +
                ", phonenum='" + phonenum + '\'' +
                '}';
    }
}
