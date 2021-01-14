/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamexercise;

import java.io.File;

/**
 *
 * @author Hristoslav-PC
 */
public class FileCreationService {
    public String createAFileAndReturnItsName(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("The file about the TeachersInfo was created! " + file.getName());
                System.out.println(file.getName() + "was created in: " + file.getAbsolutePath());
            } else {
                System.out.println("The file already exists in: " + file.getAbsolutePath());
            }
        } catch (Exception ex) {
            System.out.println("Oops, something went wrong: " + ex.getMessage());
        }
        return file.getName();
    }
}
