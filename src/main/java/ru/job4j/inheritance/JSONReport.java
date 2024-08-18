package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\t\"name\" : \"" + name + "\"," + System.lineSeparator()
                + "\t\"body\" : \"" + body + "\"" + System.lineSeparator()
                + "}";
    }

    public static void main(String[] args) {
        JSONReport asd = new JSONReport();
        String b = asd.generate("asd", "man");
        System.out.println(b);
    }
}
