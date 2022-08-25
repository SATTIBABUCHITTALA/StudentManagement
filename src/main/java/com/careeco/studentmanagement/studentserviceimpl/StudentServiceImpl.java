package com.careeco.studentmanagement.studentserviceimpl;

import com.careeco.studentmanagement.model.Student;
import com.careeco.studentmanagement.studentservice.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements StudentService {



    @Override
    public void sortOutStudentList(List<Student> studentList) {

        //comparator


        Comparator<Student> ageComparator=new Comparator<Student>() {
            @Override //number >1,<1
            public int compare(Student o1, Student o2) { //24,22,21,19 22,24
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };
        Comparator<Student> nameComparator=new Comparator<Student>() {
            @Override //number >1,<1
            public int compare(Student o1, Student o2) { //24,22,21,19 22,24
                return String.CASE_INSENSITIVE_ORDER.compare(o1.getStudentName(),o2.getStudentName());
            }
        };
        Collections.sort(studentList,ageComparator);

        for(Student std:studentList)
            System.out.println(std);

    }
    @Override
    public List<Student> insertStudentData() {
        List<Student> list =new ArrayList<Student>();
        Student student =new Student();
        student.setStudentId("101");
        student.setStudentName("Shivesh");
        student.setAge(23);
        list.add(student);

        student =new Student();
        student.setStudentId("102");
        student.setStudentName("Harika");
        student.setAge(24);
        list.add(student);

        student =new Student();
        student.setStudentId("103");
        student.setStudentName("Laxmi");
        student.setAge(22);
        list.add(student);

        student =new Student();
        student.setStudentId("104");
        student.setStudentName("Nikhila");
        student.setAge(25);
        list.add(student);

        for(Student std:list){
            System.out.println(std);
        }

       return list;
    }
}
