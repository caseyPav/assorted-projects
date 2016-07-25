/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.basicrecords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StudentMain {
        public static void main(String[] args) throws IOException {

        Student[] sampleStudents = new Student[3];
        Student student1 = new Student("001");
        student1.setFirstName("John");
        student1.setLastName("Doe");
        student1.setCohort("java may 2016");
        Student student2 = new Student("002");
        student2.setFirstName("Mary");
        student2.setLastName("Doe");
        student2.setCohort("java may 2016");
        Student student3 = new Student("003");
        student3.setFirstName("greg");
        student3.setLastName("Doe");
        student3.setCohort("c# may 2016");

        sampleStudents[0] = student1;
        sampleStudents[1] = student2;
        sampleStudents[2] = student3;

        writeStudentData(sampleStudents);
        
        readStudentData();

    }

    public static void writeStudentData(Student[] students) throws IOException {

        //creat string id firstname lastname cohort speerated by::
        //open file for writing
        PrintWriter out = new PrintWriter(new FileWriter("Students.txt"));
        //colection of students 

        for (Student student : students) {
            String studentInfo = student.getStudentID() + "::" + student.getFirstName() + "::" + student.getLastName() + "::" + student.getCohort();
            out.println(studentInfo);

        }
        out.flush();
        out.close();

    }

    public static void readStudentData() throws IOException {

        //open file for reading
        // create collection for objs 
        ArrayList<Student> studentList = new ArrayList<Student>();

        // loop through file ln by ln
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("Students.txt")));

            while (sc.hasNextLine()) {
                    String studentStringEncoded = sc.nextLine();
                   /// get id
                   String [] studentProperties = studentStringEncoded.split("::");
                //for each line create a student obj
                
                
                
                Student newStudent = new Student(studentProperties[0]);
                
                newStudent.setFirstName(studentProperties[1]);
                newStudent.setLastName(studentProperties[2]);
                newStudent.setCohort(studentProperties[3]);
                
                
                studentList.add(newStudent);
                
                
                
                //map fields fro mtext file to props of the object
                //add student to collection of students 
                ///loop thru and print
                for (Student s :studentList){
                    System.out.println(s.getFirstName() + " " + s.getLastName() + " ("  + s.getStudentID() + " )" + s.getCohort());
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("cannot find file");
        }
    }

}

