package Hibernate;

public class DatabeUtilitis {
    public static String DB_Host = "localhost";// machine ip or localhost if the database is locally installed
    public static String DB_PORT = "3306";
    public static String DB_NAME= "schoolcatalogue";// or schema name
    public static String DB_URL = "jdbc:mysql://" + DB_Host+ ":" +DB_PORT+ "/" + DB_NAME;
    public static String DB_USER  = "newuser1";
    public static String DB_PASS = "";
}
