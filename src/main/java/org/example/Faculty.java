package org.example;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String facultyName;
    List<Student> studentsOnFaculty;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentsToFaculty (Student student){
        studentsOnFaculty.add(student);
    }

    @Override
    public String toString() {
        return  "facultyName = '" + facultyName + '\'' + '\n' +
                "studentsOnFaculty: " + '\n' + studentsOnFaculty +
                '\n' + '\n';
    }
}
