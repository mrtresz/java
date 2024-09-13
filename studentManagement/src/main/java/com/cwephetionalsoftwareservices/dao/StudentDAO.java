package com.cwephetionalsoftwareservices.dao;

import com.cwephetionalsoftwareservices.model.Student;

public interface StudentDAO {
    public boolean addStudent(Student student);
    public void updateStudent(int roll, String name, double percentage, String city, String college);

    void updateStudent(int roll, String update, int ch, com.cwephetionalsoftwareservices.dao.Student student);

    public boolean deleteStudent(int roll);
    public void showAllStudents();
    public boolean showStudentById(int roll);
}