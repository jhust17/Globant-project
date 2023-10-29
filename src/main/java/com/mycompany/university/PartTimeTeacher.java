/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author jhust
 */
public class PartTimeTeacher extends Teacher {

    private int activeHoursPerWeek;

    public PartTimeTeacher(String name,int activeHoursPerWeek, double baseSalary) {
        super(baseSalary, name);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * activeHoursPerWeek;
    }
}
