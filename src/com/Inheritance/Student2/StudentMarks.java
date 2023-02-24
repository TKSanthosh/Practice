package com.Inheritance.Student2;

 public class StudentMarks {
    private String name;
    private int rollno;
    StudentMarks(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

}
class ExamMarks extends StudentMarks{
    protected int mark1;
    protected int mark2;
    protected int mark3;
    ExamMarks(String name, int rollno,int mark1,int mark2,int mark3) {
        super(name, rollno);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}
class Results extends ExamMarks{
     Results(String name, int rollno,int mark1,int mark2,int mark3) {
         super(name,rollno,mark1,mark2,mark3);
     }
     private int totalmarks;
     public int getTotalMark() {
         this.totalmarks = this.mark1 + this.mark2 + this.mark3;
         return this.totalmarks;
     }
}
class MarkRunner {
    public static void main(String[] args) {
        Results stu1 = new Results("santhosh",12,10,20,30);
        stu1.getTotalMark();
    }
}
