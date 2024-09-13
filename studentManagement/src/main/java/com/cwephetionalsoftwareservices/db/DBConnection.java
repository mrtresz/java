package com.cwephetionalsoftwareservices.db;

/*
     STEPS TO CONNECT TO A DATABASE USING JDBC;

    1 import the package
    2 load AND register the driver
    3 establish the connection
    4 create the statement
    5 execute the query
    6 process result
    7 close the connection
     */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/StudentManagement";
    private static final String USER = "postgres";
    private static final String PASSWORD = "NT@Z#321*bst$%";
    private static Connection connection = null;

//    Method to get the connection
    public static Connection getConnection(){
        if(connection == null){
            try{
//                load the PostgresSQL driver
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL,USER,PASSWORD);
                System.out.println("Connection to PostgreSQL established");
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Failed to connect to PostgreSQL");
            }catch(ClassNotFoundException e){
                e.printStackTrace();
                System.out.println("Failed to load PostgreSQL Driver");
            }
        }
        return connection;
    }


    public static void closeConnection(){
        if(connection != null){
            try{
                connection.close();
                System.out.println("Connection closed");
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Failed to close connection");
            }
        }
    }











}
