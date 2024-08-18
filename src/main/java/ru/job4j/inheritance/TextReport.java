package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static void main(String[] args) {
        TextReport asd = new TextReport();
        String a = asd.generate("asd", "man");
        System.out.println(a);
    }
}
