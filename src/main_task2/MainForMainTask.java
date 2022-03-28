package mainTask;

import java.time.LocalDate;
import java.time.Period;

public class MainForMainTask {

    public static void main(String[] args) {
        Student student1 = new Student("Avetyan ", "Ani ", "Tigran", 125693, "English", 2, "third", LocalDate.parse("2000-10-02"), "Satyan 1", "077-12-12-13");
        Student student2 = new Student("Poghosyan ", "Mari ", "Aram ", 152652, "Math",1, "first", LocalDate.parse("2003-03-12"), "Satyan 2", "099-582163");
        Student student3 = new Student("Petrosyan ", "Artur", "Hakob", 256325, "Math", 3, "second", LocalDate.parse("1995-08-15"), "Satyan 3", "098-256314");
        Student student4 = new Student("Sargsyan ", "Anna", "Alik", 256555, "Math", 1, "second", LocalDate.parse("1992-08-15"), "Satyan 3", "098-256314");
        Student student5 = new Student("Mkrtchyan ", "Armen", "Ara", 258555, "Math", 4, "second", LocalDate.parse("1992-08-15"), "Satyan 3", "098-256314");
        Student student6 = new Student("Hakobyan ", "Nare", "Aram", 257955, "English", 2, "second", LocalDate.parse("1992-08-15"), "Satyan 3", "098-256314");

        FacultyList list=new FacultyList();
        list.addStudent(student1);
        list.addStudent(student2);
        list.addStudent(student3);
        list.addStudent(student4);
        list.addStudent(student5);
        list.addStudent(student6);

        list.displayFaculty("Math");
        list.displayFacultyAndCourse("English",2);
        list.display();
        list.displayGroup("first");
    }}