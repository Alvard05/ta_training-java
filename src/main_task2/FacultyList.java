package main_task2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class FacultyList {

     List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void displayFaculty(String faculty) {
        System.out.println(" ");
        System.out.println("   List of students for " + faculty + " faculty");
        for (Student s : studentsList) {
            if (s.getFaculty().equals(faculty)) {
                System.out.println(s);
            }
        }
    }

    public void displayFacultyAndCourse(String faculty, int course) {
        System.out.println(" ");
        System.out.println("   List of students for " + faculty + " faculty from " + course + " course");
        for (Student s : studentsList) {
            if (s.getFaculty().equals(faculty) & s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }

    public void displayGroup(String group) {

        System.out.println(" ");

        System.out.println("   List of students for " + group + " group");
        for (Student s : studentsList) {
            if (s.getGroup().equals(group)) {
                System.out.println(s);
            }
        }
    }

    public void display() {
        System.out.println(" ");
        System.out.println("   List of students born after 1995.01.01");
        for (Student s : studentsList) {

            LocalDate year = LocalDate.now();
            LocalDate markedYear = LocalDate.of(1995, 01, 01);
            year = s.getBirthdate();
            int years = Period.between(year, markedYear).getYears();
            if (years <= 0) {
                System.out.println(s);
            }
        }
    }}


