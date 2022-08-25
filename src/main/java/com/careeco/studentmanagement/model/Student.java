package com.careeco.studentmanagement.model;

public class Student implements Comparable<Student>{
    private String studentId;
    private String studentName;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getAge(),o.getAge());
    }
}
