package org.example;

import com.github.aistomin.sexist.DefaultDictionary;
import com.github.aistomin.sexist.NamesDictionary;
import com.github.javafaker.Faker;

import java.util.Random;

import static org.example.Main.studentsList;

public class CreateStudents {
     static void Create(int numberOfStudents) {

        class CreateUser {

           static int getAge() {
              Random random = new Random();
              return random.nextInt(20, 40);
           }

           static int getCourse() {
              Random random = new Random();
              return random.nextInt(1, 6);
           }

           static double getAvgGrade() {
              Random random = new Random();
              return (double)(Math.round(random.nextDouble(1, 10)*10))/10;
           }
        }

        Faker faker = new Faker();
        NamesDictionary dictionary = new DefaultDictionary();

        for (int i=0; i<numberOfStudents; i++){
           String firstName = faker.name().firstName();
           String sexFromFirstName = String.valueOf(dictionary.gender(firstName));

           Student student = new Student(
                   firstName,
                   faker.name().lastName(),
                   sexFromFirstName,
                   CreateUser.getAge(),
                   CreateUser.getCourse(),
                   CreateUser.getAvgGrade()
           );

           studentsList.add(student);
        }

    }
}
