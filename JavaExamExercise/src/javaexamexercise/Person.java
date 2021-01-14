/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamexercise;

import java.util.Scanner;

/**
 *
 * @author Hristoslav-PC
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Scanner scanner, int age) {
        //setting the name from the user's input
        System.out.println("Please enter a name: ");
        setName(scanner.nextLine());
        setAge(age);
    }
    
    public Person() {}

    @Override
    public String toString() {
        return  "name: " + this.name + ", age: " + this.age;
    }
    
}
