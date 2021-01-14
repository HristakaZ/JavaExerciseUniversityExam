/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamexercise;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hristoslav-PC
 */
public class FileWritingService {
    public void writeToAFile(String fileName, List<Teacher> teachers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            System.out.println("Starting to write to the file destination!");
            for (Teacher teacher : teachers) {
                fileWriter.write(teacher + "\n");
            }
            fileWriter.close();
            System.out.println("Successfully wrote to the file!");
        } catch (Exception ex) {
            System.out.println("Oops, something went wrong: " + ex.getMessage());
        }
    }
}
