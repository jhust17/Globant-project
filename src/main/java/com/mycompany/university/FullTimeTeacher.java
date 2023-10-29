/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author jhust
 */
public class FullTimeTeacher extends Teacher {

    private int experienceYears;

    public FullTimeTeacher(String name, int experienceYears, double baseSalary) {
        super(baseSalary, name);
        this.experienceYears = experienceYears;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * (1 + 0.1 * experienceYears);
    }
}
