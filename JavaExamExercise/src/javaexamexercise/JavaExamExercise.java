/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamexercise;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hristoslav-PC
 */
public class JavaExamExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dayHoursForFirstTeacher = new int[5];
        int[] dayHoursForSecondTeacher = new int[5];
        int[] dayHoursForThirdTeacher = new int[5];
        for (int i = 0; i < dayHoursForFirstTeacher.length; i++) {
            dayHoursForFirstTeacher[i] = i;
        }
        for (int i = 0; i < dayHoursForSecondTeacher.length; i++) {
            if (i % 2 == 0) {
                dayHoursForSecondTeacher[i] = i;
            }
        }
        for (int i = 0; i < dayHoursForThirdTeacher.length; i++) {
            if (i % 2 != 0) {
                dayHoursForThirdTeacher[i] = i;
            }
        }
        /*setting some foo data to show that the sorting works(check the file for proof - sorting by ascending order)*/
        dayHoursForFirstTeacher[0] = 50;
        dayHoursForSecondTeacher[0] = 100;      
        dayHoursForThirdTeacher[0] = 2;
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher(scanner, 20, "Cambridge School", dayHoursForFirstTeacher);
        Teacher secondTeacher = new Teacher(scanner, 25, "Oxford School", dayHoursForSecondTeacher);
        Teacher thirdTeacher = new Teacher(scanner, 35, "London School", dayHoursForThirdTeacher);
        List<Teacher> teachers = new ArrayList();
        teachers.add(teacher);
        teachers.add(secondTeacher);
        teachers.add(thirdTeacher);
        //here we print the data UNSORTED
        teachers.forEach(x -> {
            System.out.println(x.toString());
        });
        //sorting the arraylist BEFORE sending the data to the file(here we upload the data into the file SORTED)
        Collections.sort(teachers);
        File file = new File("InformationAboutTheTeachers.txt");
        FileCreationService fileCreationService = new FileCreationService();
        String fileName = fileCreationService.createAFileAndReturnItsName(file);
        FileWritingService fileWritingService = new FileWritingService();
        fileWritingService.writeToAFile(fileName, teachers);
    }
    
}
