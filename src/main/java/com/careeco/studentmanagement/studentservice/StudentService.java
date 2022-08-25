package com.careeco.studentmanagement.studentservice;

import com.careeco.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {

    void sortOutStudentList(List<Student> studentList);

    List<Student> insertStudentData();

}
