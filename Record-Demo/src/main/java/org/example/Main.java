package org.example;

import org.example.nisanth.Student;
import org.example.nisanth.StudentRecord;

public class Main {
    public static void main(String[] args)
    {
        Student student=new Student(1L,"Nisanth","nisanthselva2004@gmail.com");
        System.out.println(student);
        student.setName("Sujith");
        System.out.println(student);

        System.out.println("----------------------------Using Record---------------");
        var studentrecord=new StudentRecord(2L,"kaaviyan","Kaviyan2gmail.com");
        System.out.println(studentrecord);

    }
}