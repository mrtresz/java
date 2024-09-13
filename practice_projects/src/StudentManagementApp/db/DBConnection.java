package StudentManagementApp.db;

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

    private static final String URL = "jdbc:mysql://localhost:3306/studentmanagement";
    private static final String USER = "postgres";
    private static final String PASSWORD = "NT@Z#321*bst$%";
    private static Connection connection = null;


}
