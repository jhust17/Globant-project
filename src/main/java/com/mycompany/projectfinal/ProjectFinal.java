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
import java.util.ArrayList;
import java.util.Collections;

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
        ClassRoom.listClass.add(new ClassRoom("History", "Room B", Teacher.listTeacher.get(1), Student.listStudent));
        ClassRoom.listClass.add(new ClassRoom("Physics", "Room C", Teacher.listTeacher.get(2), Student.listStudent));
        ClassRoom.listClass.add(new ClassRoom("Chemistry", "Room D", Teacher.listTeacher.get(3), Student.listStudent));

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
                    for (Teacher teacher : Teacher.listTeacher) {
                        System.out.println(teacher.getName() + "-Salario: $" + teacher.calculateSalary() + "\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < ClassRoom.listClass.size(); i++) {
                        System.out.println(i + ". " + ClassRoom.listClass.get(i).getName());
                    }
                    int op = scanner.nextInt();
                    if (op >= 0 && op < ClassRoom.listClass.size()) {
                        ClassRoom selectedClass = ClassRoom.listClass.get(op);
                        System.out.println("Nombre Clase: " + selectedClass.getName());
                        System.out.println("Aula: " + selectedClass.getClassroom());
                        System.out.println("Profesor: " + selectedClass.getTeacher().getName());
                        System.out.println("Estudiantes:");
                        for (Student student : selectedClass.getStudents()) {
                            System.out.println(student.getName());
                        }
                        System.out.println();
                    } else {
                        System.out.println("Opción invalida");
                    }
                    break;
                case 3:
                    System.out.println("Nombre: ");
                    Scanner nombre = new Scanner(System.in);
                    String name = nombre.nextLine();
                    System.out.println("Edad: ");
                    Scanner edad = new Scanner(System.in);
                    int age = edad.nextInt();
                    ClassRoom selectedClass = ClassRoom.listClass.get(0);
                    selectedClass.addStudent(new Student(name, selectedClass.getStudents().size() + 1, age));
                    System.out.println("Fue agregado a la clase de: " + selectedClass.getName() + "\n");
                    break;
                case 4:
                    System.out.println("Nombre: ");
                    Scanner nombreClase = new Scanner(System.in);
                    String nameClass = nombreClase.nextLine();
                    System.out.println("Aula: ");
                    Scanner room = new Scanner(System.in);
                    String roomName = room.nextLine();
                    ClassRoom.listClass.add(new ClassRoom(nameClass, roomName, Teacher.listTeacher.get(1), Student.listStudent));
                    break;
                case 5:
                    for (Student student : Student.listStudent) {
                        System.out.println(student.getId() + ". " + student.getName());
                    }
                    Scanner opId = new Scanner(System.in);
                    int id = opId.nextInt();
                    ArrayList<ClassRoom> studentClasses = ClassRoom.getClassesForStudent(id);

                    if (studentClasses.isEmpty()) {
                        System.out.println("Student not found in any classes.");
                    } else {
                        System.out.println("Classes: ");
                        for (ClassRoom studentClass : studentClasses) {
                            System.out.println(studentClass.getName());
                        }
                        System.out.println();
                    }
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
