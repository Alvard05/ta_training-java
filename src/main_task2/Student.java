package mainTask;

import java.time.LocalDate;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate birthdate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;
    private LocalDate requiredDate;

    //creating constructor for MarkedBirthYearList
    public Student(LocalDate requiredDate){
        this.requiredDate = requiredDate;}


    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

//creating constructor for students list

    public Student(String studentSurname, String studentName, String studentMiddleName, int studentId, String studentFaculty,
                   int studentCourse,String studentGroup, LocalDate studentBirthdate, String studentAddress, String studentPhoneNumber){
        this.id = studentId;
        this.surname = studentSurname;
        this.name = studentName;
        this.middleName = studentMiddleName;
        this.faculty = studentFaculty;
        this.course = studentCourse;
        this.group = studentGroup;
        this.birthdate = studentBirthdate;
        this.address = studentAddress;
        this.phoneNumber = studentPhoneNumber;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;

    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }


}
