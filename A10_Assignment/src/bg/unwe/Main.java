/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Plamen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Course> courses = new ArrayList<>();        

        while (true) {
            System.out.print("Enter new course or enter for break: ");
            String line = scanner.nextLine();

            if (line.length() > 0) {
                Course course = new Course();
                course.setName(line);

                while (true) {
                    System.out.print("Enter new student or enter for break: ");
                    line = scanner.nextLine();

                    if (line.length() > 0) {
                        Student student = new Student();
                        student.setName(line);

                        course.addStudent(student);
                    } 
                    else {
                        break;
                    }
                }

                courses.add(course);
            } 
            else {
                break;
            }
        }
        
        System.out.println("");

        for (int i = 0; i < courses.size(); i++) {
            Course c = courses.get(i);

            System.out.print("Course " + (i + 1) + ": " + c.getName());

            for (int k = 0; k < c.getStudentsCount(); k++) {
                Student s = c.getStudent(k);

                System.out.print(", Student " + (k + 1) + ": " + s.getName());
            }

            System.out.println("");
        }
    }

}
