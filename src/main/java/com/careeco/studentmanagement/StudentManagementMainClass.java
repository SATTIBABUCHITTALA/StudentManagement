package com.careeco.studentmanagement;

import com.careeco.studentmanagement.model.Student;
import com.careeco.studentmanagement.studentserviceimpl.StudentServiceImpl;

import java.util.List;

public class StudentManagementMainClass {

    public static void main(String args[]){

        StudentServiceImpl studentServiceImpl =new StudentServiceImpl();
        List<Student> studentList = studentServiceImpl.insertStudentData();

        studentServiceImpl.sortOutStudentList(studentList);
    }
}
