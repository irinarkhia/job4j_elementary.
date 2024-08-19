package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        String specialName = "Clean code";
        book4.setName(specialName);
        Book[] bookArray = new Book[4];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;
        bookArray[3] = book4;
        for (int j = 0; j < bookArray.length; j++) {
            System.out.println(bookArray[j].getName());
        }
        Book supply = bookArray[3];
        bookArray[3] = bookArray[0];
        bookArray[0] = supply;
        for (int j = 0; j < bookArray.length; j++) {
            if (specialName.equals(bookArray[j].getName())) {
                System.out.println(bookArray[j].getName());
            }
        }
    }
}
