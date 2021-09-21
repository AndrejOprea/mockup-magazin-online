package ro.mycodescool.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {

    private String jdbcurl = "jdbc:mysql://localhost:3306/magazin";
    private String user = "root";
    private String password = "Capitala1991";
    private Connection connection=null;
    protected Statement statement=null;

    public SQL(){

        try {

            connection = DriverManager.getConnection(jdbcurl,user,password);
            statement = connection.createStatement();

        }catch(SQLException e){

            e.printStackTrace();
        }
    }

    public void executeStatement(String deExecutat){

        try {
            statement.execute(deExecutat);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nu a mers !!!");
        }

    }





}
