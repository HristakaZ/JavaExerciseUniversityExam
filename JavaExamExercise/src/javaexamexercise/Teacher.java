/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamexercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hristoslav-PC
 */
public class Teacher extends Person implements Comparable<Teacher> {
    private String school;
    //explicitly setting the array's length(as to avoid passing any array in the main method that exceeds the given length)
    private int[] dayHours = new int[5];
    public Teacher() {}
    public Teacher(Scanner scanner, int age, String school, int[] dayHours){
        //setting the name from the user's input
        super(scanner, age);
        setSchool(school);
        setDayHours(dayHours);
    }
    
    public String getName() {
        return super.getName();
    }
    
    public void setName(String name) {
        super.setName(name);
    }
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int[] getDayHours() {
        return this.dayHours;
    }

    public void setDayHours(int[] dayHours) {
        this.dayHours = dayHours;
    }

    public int getAge() {
        return super.getAge();
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        String informationAboutTheTeacher = "Teacher's school: " + getSchool() + ", Teacher's name and age: " 
                + super.toString() + ", Teacher's dayHours: " + Arrays.toString(getDayHours()) 
                + ", Teacher's average day hours: " + avgHours(this.getDayHours());
        return informationAboutTheTeacher;
    }
    
    public int avgHours(int[] dayHours) {
        dayHours = this.getDayHours();
        int sum = 0;
        int averageHours = 0;
        for (int i = 0; i < dayHours.length; i++) {
            sum += dayHours[i];
        }
        averageHours = sum / dayHours.length;
        return averageHours;
    }

    @Override
    public int compareTo(Teacher teacher) {
        return Integer.compare(this.avgHours(this.getDayHours()), teacher.avgHours(teacher.getDayHours()));
    }
    
}
