package supermarket2;



import java.sql.*;

public class DBConnection {
    private static final String user="root";
    private static final String url="jdbc:mysql://localhost:3306/supermarketdb";
    private static final String pass="Prasant@7978";
   
    public static Connection connectDB()
    {
        Connection con = null;
        try{
                con = DriverManager.getConnection(url,user,pass);
                
        }catch(Exception e){
            System.out.println("DB Connection error...");
            e.printStackTrace();
            return null;
        } 
        return con;
    }
    
}
