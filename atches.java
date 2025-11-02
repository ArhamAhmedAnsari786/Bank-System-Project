package bank.management.system;

import java.sql.*;

public class atches {
    Connection connection;
    Statement statement;

    public atches(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Editza786");
            statement = connection.createStatement();
        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
