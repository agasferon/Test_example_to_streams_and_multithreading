package org.example;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> studentsList = new ArrayList<>();
    public static ArrayList<Faculty> facultyList = new ArrayList<>();
    static int numberOfStudents = 10;
    public static int numberOfFaculty = 3;

    public static void main(String[] args) {
        CreateStudents.Create(numberOfStudents);

        studentsList.stream().forEach(student -> System.out.println(student));
        System.out.println(studentsList.stream().count() + " students");
        System.out.println();

        studentsList.stream().filter(student -> student.getAvgGrade() > 7).forEach(System.out::println);
        System.out.println(studentsList.stream()
                .filter(student -> student.getAvgGrade() > 7).count() + " students whose average grade is higher than 7");
        System.out.println();

        studentsList.stream().filter(student -> student.getAge() > 20 & student.getAge() < 30).
                forEach(System.out::println);
        System.out.println(studentsList.stream()
                .filter(student -> student.getAge() > 20 & student.getAge() < 30).count() + " students over 20 and under 30 years old");

        System.out.println();
        System.out.println("###########################################");
        CreateFaculty.Create(numberOfFaculty);
        System.out.println(facultyList);
        System.out.println("###########################################");

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(System.out::println);

        System.out.println();

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .filter(student -> student.getAvgGrade() > 7)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("####################Multithreading#######################");

        StudentsCountThreads.PrintStudentsArrayList printStudentsArrayList = new StudentsCountThreads.PrintStudentsArrayList();
        printStudentsArrayList.setPriority(Thread.NORM_PRIORITY);
        printStudentsArrayList.setName("StudentsArrayList");
            System.out.println(
                "Thread name = " + printStudentsArrayList.getName() + " | "
                        + "Thread id = " + printStudentsArrayList.getId() + " | "
                        + "Thread priority = " + printStudentsArrayList.getPriority());
        printStudentsArrayList.start();

        System.out.println();

        Thread printStudentsAfterDivision = new Thread(new StudentsCountThreads.PrintStudentsAfterDivision());
        printStudentsAfterDivision.setPriority(Thread.NORM_PRIORITY);
        printStudentsAfterDivision.setName("StudentsArrayList");
            System.out.println(
                "Thread name = " + printStudentsAfterDivision.getName() + " | "
                        + "Thread id = " + printStudentsAfterDivision.getId() + " | "
                        + "Thread priority = " + printStudentsAfterDivision.getPriority());
        printStudentsAfterDivision.start();

        System.out.println();

    }
}