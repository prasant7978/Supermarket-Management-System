package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import supermarket2.DBConnection;

public class stocksDb extends dbConnection {
    ResultSet rss;
     public ResultSet ShowLowStocks(){
        try{
            con = DBConnection.connectDB();
            PreparedStatement st = con.prepareStatement("select productId,productName,productQuantity,productCatagory from productdb where productQuantity<100");
            rss = (ResultSet) st.executeQuery();          
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }

    
}
