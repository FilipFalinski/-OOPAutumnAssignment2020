package com.Filip.Falinski;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private int grade1;
    private int grade2;
    private int grade3;
    private final int GRADES = 3;
    int[] grades = new int[GRADES];


    public Student(String studentId, String firstName, String lastName,
                   int age, int grade1, int grade2, int grade3)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;

        this.age = age;
        setGrade1(grade1);
        setGrade2(grade2);
        setGrade3(grade3);
    }

    public String getStudentId()
    {
        return studentId;
    }

    private void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    private void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    private void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    public int getAge()
    {
        return age;
    }

    private void setAge(int age)
    {
        this.age = age;
    }

    public int getGrade1()
    {
        return grades[0];
    }

    private void setGrade1(int grade1)
    {
        this.grades[0] = grade1;
    }

    public int getGrade2()
    {
        return grades[1];
    }

    private void setGrade2(int grade2)
    {
        this.grades[1] = grade2;
    }

    public int getGrade3()
    {
        return grades[2];
    }

    private void setGrade3(int grade3)
    {
        this.grades[2] = grade3;
    }

    public void print()
    {
        String studentId = getStudentId();
        String firstName = getFirstName();
        String lastName = getLastName();
        int age = getAge();
        int grade1 = getGrade1();
        int grade2 = getGrade2();
        int grade3 = getGrade3();

        System.out.println("Student ID: " +studentId+ "\t Firstname: " +firstName+ "\t Lastname: "
                +lastName+  "\t Age: " +age+ "\t Grades: " + "\t{"+grade1+ ","
                +grade2+ "," +grade3+ "}");
    }
}