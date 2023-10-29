/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

import java.util.ArrayList;

/**
 *
 * @author jhust
 */
public class Student extends University {

    private int id;
    private int age;
    private static final ArrayList<Student> listStudent = new ArrayList<>();
    public Student(int id, int age, String name) {
        super(name);
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<Student> getListStudent() {
        return listStudent;
    }
    
    
}
