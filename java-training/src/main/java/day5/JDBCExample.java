package day5;

import java.sql.*;

public class JDBCExample {
    // Queries inside your mysql workbench.
    // Java JDBC basically provide some API's to do that..
    /*

    (i) You need to connect with your database
    (ii) Execute queries on your database

     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Loads the JDBC driver
        // JDBC code and it loads the code and executes and set things
        // so that you can run the JDBC API.
//        Class.forName("com.mysql.jdbc.Driver");

        // Connect to the database
//        Connection connection = DriverManager
//                .getConnection("jdbc:mysql://localhost/database","username","password");
        // mysql by default runs on port 3306
       Connection connection = DriverManager.getConnection("jdbc:mysql://4.tcp.ngrok.io:16650/agbi","agbi","agbi");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from customers");
        while(resultSet.next()){
            int numOfColumns = resultSet.getMetaData().getColumnCount();
            for(int i=1;i<=numOfColumns;i++)
                System.out.print(resultSet.getString(i) +  " | ");
//            System.out.println(resultSet.getString(1) + " , "+ resultSet.getString(2)
//            +" , "+resultSet.getString("address"));
            System.out.println();
        }
        String sql = "update customers set  postal_code = 1000 where customer_id=2";
        statement.executeUpdate(sql);
        connection.close();
    }
    // CRUD - create, read, update, delete
    // You need to compare both JDBC and Hibernate and see what are the differences
    // between them. And in which scenarios you can use what.
    // hibernate -> advance version of connecting with mysql Server
    // better way to connect with the server and execute.

}
