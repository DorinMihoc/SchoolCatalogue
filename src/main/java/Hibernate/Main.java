package Hibernate;

import Repository.StudentRepository;
import SchoolElements.Student;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


//    public static void main(String[] args) {
//
//        // ensure database state by executing these queries
//        // drop table person;
//        // create table person(id int primary key, name varchar(20));
//        // insert into person(id,name) values (1,'ion');
//        // insert into person(id,name) values (2,'gheorghe');
//        // select * from person;
//
//        // credentials and connectivity configuration
//        String machine = "localhost";// machine ip or localhost if the database is locally installed
//        String port = "3306";
//        String databaseName = "humanresources2";// or schema name
//        String url = "jdbc:mysql://" + machine + ":" + port + "/" + databaseName;
//        String username = "newuser1";
//        String password = "";
//
//        // SQL string to execute
//        String sql = "Select * from departments";
//
//        // expected data
//        List<Department> departments = new ArrayList<>();
//
//        // connection to use
//        Connection connection = null;
//
//        try {
//
//           // create database connection
//           connection = DriverManager.getConnection(url, username, password);
//
//            //create SQL statement
//          Statement statement = connection.createStatement();
//
//            //execute SQL statement and obtain the result
//          ResultSet resultSet = statement.executeQuery(sql);
//
//            //loop through the result set
//          while (resultSet.next()) {
//////
////               // get data and process it row by row
//               int id = resultSet.getInt("departmentId");
//              String firstName = resultSet.getString("name");
////               String lastName = resultSet.getString("lastName");
////                String address =resultSet.getString("Str.Mare");
////               int age =resultSet.getInt("16");
////
//////                // build object
//             //  Student student = new Student();
//
//              Department department = new Department();
//////
//////                 and add it to
//                  departments.add(department);
//////
//            }
////
////            // optional
//           resultSet.close();
////
////            // optional
//         statement.close();
////
//      } catch (SQLException e) {
////
////            // process or not
//          throw new RuntimeException(e);
////
//        } finally {
////
////            // always close the connection
//           try {
////
////                // safety check always
//              if (connection != null) {
//                    connection.close();
//                }
////
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
////
//      }
////
////        // verify result by checking database table data and console output
//       System.out.println(departments);
//    }


    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student());
    }


}

