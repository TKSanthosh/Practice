package com.Inheritance.Student;
class Student {
    private String name;
    private int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

class Exam extends Student {
   protected int marks1;
   protected int marks2;
   protected int marks3;

    public Exam(String name, int rollno, int marks1, int marks2, int marks3) {
        super(name, rollno);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
}

class Result extends Exam {
    private int totalmark;

    public Result(String name, int rollno, int marks1, int marks2, int marks3) {
        super(name, rollno, marks1, marks2, marks3);
        calculateTotalMark();
    }

    int calculateTotalMark() {
        this.totalmark = this.marks1 + this.marks2 + this.marks3;
        return this.totalmark;
    }
}
class StudentRunner{
    public static void main(String[] args) {
        Result stu1 = new Result("santhosh",12,40,50,60);
        System.out.println(stu1.calculateTotalMark());
    }
}