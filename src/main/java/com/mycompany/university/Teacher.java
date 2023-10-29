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
public class Teacher extends University {

    private double baseSalary;
    public static final ArrayList<Teacher> listTeacher = new ArrayList<>();

    public Teacher(double baseSalary, String name) {
        super(name);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public static ArrayList<Teacher> getListTeacher() {
        return listTeacher;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
