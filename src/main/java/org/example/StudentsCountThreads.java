package org.example;

import static org.example.Main.*;

public class StudentsCountThreads {
    static final Object lock = new Object();

    public static class PrintStudentsArrayList extends Thread {
        public void run() {
            synchronized (lock) {
                studentsList.stream().forEach(student -> System.out.println(student));
                System.out.println(studentsList.stream().count() + " students");
                System.out.println();
            }
        }
    }

    public static class PrintStudentsAfterDivision implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                        .forEach(System.out::println);
            }
        }
    }

}
