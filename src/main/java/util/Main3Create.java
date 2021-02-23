//package util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///**
// * simple SQL DDL example
// */
//public class Main3Create {
//
//    public static void main(String[] args) {
//
//        // credentials and connectivity configuration
//        String machine = "localhost";// machine ip or localhost if the database is locally installed
//        String port = "3306";
//        String databaseName = "schoolcatalogue";// or schema name
//        String url = "jdbc:mysql://" + machine + ":" + port + "/" + databaseName;
//        String username = "newuser1";
//        String password = "";
//
//        // SQL string to execute
//       // String sql = "create table Students(studentId int)";
//         //String sql = "alter table Students add column firstname varchar(10)";
//        String sql = "insert into Students(firstname) values('Maria')";
//        // connection to use
//        Connection connection = null;
//
//        try {
//
//            // create database connection
//            connection = DriverManager.getConnection(url, username, password);
//
//            // create SQL statement
//            Statement statement = connection.createStatement();
//
//            // execute SQL statement and obtain the result
//            statement.execute(sql);
//
//            // optional
//            statement.close();
//
//        } catch (SQLException e) {
//
//            // process or not
//            throw new RuntimeException(e);
//
//        } finally {
//
//            // always close the connection
//            try {
//
//                // safety check always
//                if (connection != null) {
//                    connection.close();
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

// nu avem nevoie de main'ul asta.
// este ce facusem noi prin JDBC.
// Pentru Hibernate am facut alta clasa in loc de main.