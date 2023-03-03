package com.Collections.List.ArrayList.Example;
import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        List<Student>studs = new ArrayList<>();
        studs.add(new Student(1,78));
        studs.add(new Student(1,65));
        studs.add(new Student(1,99));
        studs.add(new Student(1,12));
        studs.add(new Student(1,100));

        Collections.sort(studs);
        System.out.println(studs);


    }
}
class Student implements Comparable<Student> {
    private int rollNo;
    int marks;
    Student(int rollNo, int marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public String toString() {
        return "Student(" + rollNo + ", " + marks + ")";
    }

    @Override
    public int compareTo(Student o) {
        return this.marks < o.marks ? 1:-1;
    }
}