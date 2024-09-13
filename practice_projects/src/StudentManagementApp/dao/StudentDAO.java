package StudentManagementApp.dao;

import StudentManagementApp.model.Student;

public interface StudentDAO {
    public boolean addStudent(Student student);
    public boolean updateStudent(Student student);
    public boolean deleteStudent(Student student);
    public void showAllStudents();
    public boolean showStudentById(int roll);
}