/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.projectfinal;

import java.util.Scanner;
import com.mycompany.university.Teacher;
import com.mycompany.university.Student;
import com.mycompany.university.ClassRoom;
import com.mycompany.university.FullTimeTeacher;
import com.mycompany.university.PartTimeTeacher;

/**
 *
 * @author jhust
 */
public class ProjectFinal {

    public static void main(String[] args) {
        Teacher.listTeacher.add(new FullTimeTeacher("Jhon Doe", 10, 5000));
        Teacher.listTeacher.add(new FullTimeTeacher("Jane Smith", 5, 60000));
        Teacher.listTeacher.add(new PartTimeTeacher("Bob Johnson", 20, 300));
        Teacher.listTeacher.add(new PartTimeTeacher("Mary White", 10, 200));

        Student.listStudent.add(new Student("Alice", 1, 18));
        Student.listStudent.add(new Student("Bob", 2, 19));
        Student.listStudent.add(new Student("Charlie", 3, 20));
        Student.listStudent.add(new Student("David", 4, 21));
        Student.listStudent.add(new Student("Eve", 5, 22));
        Student.listStudent.add(new Student("Frank", 6, 23));

        ClassRoom.listClass.add(new ClassRoom("Math", "Room A", Teacher.listTeacher.get(0), Student.listStudent));
        ClassRoom.listClass.add(new ClassRoom("History 101", "Room B", Teacher.listTeacher.get(1), Student.listStudent));
        ClassRoom.listClass.add(new ClassRoom("Physics 101", "Room C", Teacher.listTeacher.get(2), Student.listStudent));
        ClassRoom.listClass.add(new ClassRoom("Chemistry 101", "Room D", Teacher.listTeacher.get(3), Student.listStudent));

        System.out.println("Universidad Globant");
        Menu();
    }

    public static void Menu() {
        boolean program = true;

        while (program) {
            System.out.println("Menu: ");
            System.out.println("1. Lista de profesores");
            System.out.println("2. Aulas");
            System.out.println("3. Registrar nuevo estudiante");
            System.out.println("4. Registrar nueva aula");
            System.out.println("5. Buscar las aulas del estudiante");
            System.out.println("6. Salir");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Vuelve pronto");
                    program = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }
        }
    }
}
