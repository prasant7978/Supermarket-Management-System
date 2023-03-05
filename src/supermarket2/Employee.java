package supermarket2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

abstract class Employee {

    protected Connection con = null;
    protected PreparedStatement st = null;
    protected java.sql.ResultSet rss = null;
    
    public boolean loginEmployee(String uname,String password){
        return false;
   }
    
    public void logoutEmployee(){
        new Login().setVisible(true);
    }
    
    public ResultSet viewProduct(){
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from productdb");
            rss = (java.sql.ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public ResultSet setCategory(){
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from categorydb");
            rss = (java.sql.ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
}
