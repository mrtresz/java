package com.cwephetionalsoftwareservices.dao;

import com.cwephetionalsoftwareservices.db.DBConnection;

import java.sql.*;

public class Student implements StudentDAO {


    public Student(double percentage, String city, String college, String name, int roll) {
    }

    public Student() {

    }

    @Override
    public boolean addStudent(com.cwephetionalsoftwareservices.model.Student student) {
        boolean result = false;
        try{
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO student_details(studentname, collegename, city,percentage) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, student.getFirstName());
            ps.setString(2,student.getCollegeName());
            ps.setString(3,student.getCity());
            ps.setDouble(4,student.getPercentage());
            ps.executeUpdate();
            result = true;

        }catch(Exception e){
            return false;
        }

        return result;
    }

    @Override
    public void updateStudent(int roll, String name, double percentage, String city, String college) {

    }

    @Override
    public void updateStudent(int roll, String update, int ch, Student student) {
        int choice = ch;
        try{

            if(choice == 1){
                Connection con = DBConnection.getConnection();
                String query = "UPDATE student_details SET studentname = ? WHERE rollnumber = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, update);
                ps.setInt(2, roll);
                ps.executeUpdate();

            }

        }catch(Exception e){
           e.printStackTrace();
        }
    }

    @Override
    public boolean deleteStudent(int roll) {
        boolean result = false;
        try{
            Connection con = DBConnection.getConnection();
            String query = "DELETE FROM student_details WHERE rollnumber = "+roll;
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            result = true;

        }catch (Exception e){
            return false;
        }
        return result;
    }

    @Override
    public void showAllStudents() {

        try{
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM student_details";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("Roll Number: " + rs.getInt(1));
                System.out.println("First Name: " + rs.getString(2));
                System.out.println("College Name: " + rs.getString(3));
                System.out.println("City: " + rs.getString(4));
                System.out.println("Percentage: " + rs.getDouble(5));
                System.out.println("-------------------------------------");

            }

        } catch(Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean showStudentById(int roll) {
        try{
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM student_details WHERE rollnumber ="+roll;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("Roll Number: " + rs.getInt(1));
                System.out.println("First Name: " + rs.getString(2));
                System.out.println("College Name: " + rs.getString(3));
                System.out.println("City: " + rs.getString(4));
                System.out.println("Percentage: " + rs.getDouble(5));
                System.out.println("-------------------------------------");

            }

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
