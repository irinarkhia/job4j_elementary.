package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setGroup(12);
        student.setData(" 1.09.2024");
        student.setFio("Ян Пак ");
        System.out.println(student.getFio() + student.getGroup() + student.getData());
    }
}
