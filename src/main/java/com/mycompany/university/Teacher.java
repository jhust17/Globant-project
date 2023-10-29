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

    private int yearsExperience;
    private int jobTime;
    
    private static final  ArrayList<Teacher> listTeacher = new ArrayList<>();


    public Teacher(int yearsExperience, int jobTime, String name) {
        super(name);
        this.yearsExperience = yearsExperience;
        this.jobTime = jobTime;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public int getJobTime() {
        return jobTime;
    }

    public void setJobTime(int jobTime) {
        this.jobTime = jobTime;
    }

    public static ArrayList<Teacher> getListTeacher() {
        return listTeacher;
    }
    
}
