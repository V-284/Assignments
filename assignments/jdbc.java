import java.sql.*;
class jdbc{
    
    private static volatile Connection connection;
    
    public static Connection getConnection(){

        if(connection == null){

            synchronized (jdbc.class){

                if(connection == null){

                    try {
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/persons", "root", "mysql");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return connection;
        
        
    }
    
}