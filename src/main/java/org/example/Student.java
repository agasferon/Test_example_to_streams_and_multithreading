package org.example;

public class Student {
    private String name;
    private String surname;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, String surname, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                " | surname = '" + surname + '\'' +
                " | sex = " + sex +
                " | age = " + age +
                " | course = " + course +
                " | avgGrade = " + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "noName";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        if (name != null) {
            this.surname = name;
        } else {
            this.surname = "noSurname";
        }
    }

    public String  getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0) {
            this.course = course;
        } else {
            this.course = 0;
        }
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        if (avgGrade > 0) {
            this.avgGrade = avgGrade;
        } else {
            this.avgGrade = 0;
        }
    }
}