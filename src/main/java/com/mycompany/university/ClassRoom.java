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
public class ClassRoom extends University {

    private String classroom;
    private Teacher teacher;
    private ArrayList<Student> students;
    public static final ArrayList<ClassRoom> listClass = new ArrayList<>();
    
    public ClassRoom(String name, String classroom, Teacher teacher, ArrayList<Student> students) {
        super(name);
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = students;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    
    
}
