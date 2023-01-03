package br.com.devdojo.awesome.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Student {
    private String name;
    private int id;
    static {
        studentReposytory();
    }
    public static List<Student> studentList;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public static void studentReposytory()  {
        studentList = new ArrayList<>(asList(new Student("Deku"), new Student("Bakugo")));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
