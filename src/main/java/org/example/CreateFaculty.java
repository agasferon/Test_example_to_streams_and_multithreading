package org.example;

import com.github.javafaker.Faker;

import java.util.*;

import static org.example.Main.*;

public class CreateFaculty {
    static void Create(int numberOfFaculty) {
        Random random = new Random();
        int numberOfStudentsInTheFaculty = numberOfStudents / numberOfFaculty;
        int divisionRemainder = (numberOfStudents % numberOfFaculty);

        List<Integer> qtyStudentsSet = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            qtyStudentsSet.add(i);
        }

        Faker fakeCourse = new Faker();

        for (int a = 0; a < numberOfFaculty - 1; a++) {
            Faculty faculty = new Faculty(fakeCourse.educator().course());

            for (int b = 0; b < numberOfStudentsInTheFaculty; b++) {
                int randomStudent = random.nextInt(qtyStudentsSet.size());
                faculty.addStudentsToFaculty(studentsList.get(qtyStudentsSet.get(randomStudent)));
                qtyStudentsSet.remove(randomStudent);
            }

            facultyList.add(faculty);

        }

        Faculty lastFaculty = new Faculty(fakeCourse.educator().course());
        for (int c = 0; c < numberOfStudentsInTheFaculty + divisionRemainder; c++) {
            int randomStudent = random.nextInt(qtyStudentsSet.size());
            lastFaculty.addStudentsToFaculty(studentsList.get(qtyStudentsSet.get(randomStudent)));
            qtyStudentsSet.remove(randomStudent);
        }

        facultyList.add(lastFaculty);
    }
}
