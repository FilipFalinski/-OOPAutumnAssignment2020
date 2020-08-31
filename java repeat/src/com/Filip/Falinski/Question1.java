package com.Filip.Falinski;

import java.util.ArrayList;

public class Question1 {


    private static ArrayList<Student> students = new ArrayList<>();


    public static void main(String[] args)
    {
        String [] students = {"1,John,Smith,20,88,79,59",
                "2,Suzan,Erickson,19,91,72,85",
                "3,Jack,Napoli,19,85,84,87",
                "4,Erin,Black,22,91,98,82",
                "5,Josh,Kennedy,29,80,94,70"};

        for(int i = 0; i < students.length; i++)

        {
            String characters = students[i];
            String[] arrayVar = characters.split(",");
            String studentId = arrayVar[0];
            String firstName = arrayVar[1];
            String lastName = arrayVar[2];


            int age = Integer.parseInt(arrayVar[4]);
            int grade1 = Integer.parseInt(arrayVar[5]);
            int grade2 = Integer.parseInt(arrayVar[6]);
            int grade3 = Integer.parseInt(arrayVar[7]);

            Question1.add(studentId, firstName, lastName, age, grade1, grade2, grade3);
        }

        Question1.print_all();
        Question1.print_average_grade("1");
        Question1.remove("3");
        Question1.remove("3");
    }

    public static void add(String studentId, String firstName, String lastName, int age, int grade1, int grade2, int grade3)
    {
        Student student = new Student(studentId, firstName, lastName, age, grade1, grade2, grade3);
        students.add(student);
    }

    public static void remove(String studentId)
    {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getStudentId().equals(studentId))
            {
                students.remove(i);
                System.out.println("Student " + studentId + " has been removed.");
                return;
            }
        }
        System.out.println("Error: Student ID " + studentId + " can not be found.");
    }

    public static void print_all()
    {
        for (Student student : students)
        {
            student.print();
        }
    }



    public static void print_average_grade(String studentId)
    {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                double totalGrades = student.getGrade1() + student.getGrade2() + student.getGrade3();
                double gradeAverage = totalGrades / 3;

                System.out.println("Student " + studentId + "'s average grade overall is " + gradeAverage);
            }
        }
    }
}
// abstraction is when only the essential information is display and hides the details.
// in my class it show the rooster of students that shows essential information such as age grade and name.

//hierarchy is the structure of classes. java classes have on root called object which is superclass of any class. instance and methods are inherited down through the levels.