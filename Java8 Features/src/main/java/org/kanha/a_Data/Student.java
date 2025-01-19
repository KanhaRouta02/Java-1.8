package org.kanha.a_Data;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private  String gender;

    public Optional<Bike> getBike() {
        return bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", noteBook=" + noteBook +
                ", bike=" + bike +
                ", activities=" + activities +
                '}';
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    private Integer noteBook;
    private Optional<Bike> bike = Optional.empty();

    public Integer getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(Integer noteBook) {
        this.noteBook = noteBook;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, Integer noteBook) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBook = noteBook;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<String> activities = new ArrayList<>();

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
}
