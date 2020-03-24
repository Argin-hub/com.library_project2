package buisness_logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL ="jdbc:mysql://localhost:3306/mydb_test";
    private static final String PASSWORD = "root";
    private static final String USER = "root";
  //  private static final String DRIVER = "jdbc:mysql://localhost:3306/mydb_test";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
System.out.println("Connection OK");
        }
        catch (SQLException qq){
qq.printStackTrace();
System.out.println("Ne ok");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ne ustanovilis'");
        }
        return connection;
    }
}
