import java.io.*;
import java.util.*;

class Person {
    String firstName;
    String lastName;
    int idNumber;

    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate() {
        int total = 0;

        for (int testScore : testScores) {
            total += testScore;
        }
        int avg = total / testScores.length;

        if (avg >= 90 && avg <= 100) {
            return 'O';
        }
        if (avg >= 80 && avg < 90) {
            return 'E';
        }
        if (avg >= 70 && avg < 80) {
            return 'A';
        }
        if (avg >= 55 && avg < 70) {
            return 'P';
        }
        if (avg >= 40 && avg < 55) {
            return 'D';
        }
        return 'T';

    }

}

public class Day12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int idNumber = sc.nextInt();
        int noOfScore = sc.nextInt();
        int[] testScores = new int[noOfScore];
        for (int i = 0; i < noOfScore; i++) {
            testScores[i] = sc.nextInt();
        }
        sc.close();

        Student st = new Student(firstName, lastName, idNumber, testScores);
        st.printPerson();
        System.out.println("Grade: " + st.calculate());
    }
}
