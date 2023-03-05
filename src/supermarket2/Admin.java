package supermarket2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

class Admin extends Employee{
    
    @Override
    public boolean loginEmployee(String uname,String password){
        try {
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from admindb where adminName='"+uname+"' and adminPassword='"+password+"'");
            rss = (java.sql.ResultSet) st.executeQuery();
          
            if(rss.next())
                return true;
            else
                return false;
        
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void resetPassword(String name,String pass){
        try{
                con = DBConnection.connectDB();
                String query = "update admindb set adminName='"+name+"',adminPassword='"+pass+"' where adminId="+1;
                java.sql.Statement st = con.createStatement();
                st.executeUpdate(query);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    
    public ResultSet ShowLowStocks(){
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select productId,productName,productQuantity,productCatagory from productdb where productQuantity<100");
            rss = (ResultSet) st.executeQuery();          
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public ResultSet salesReport(){
        String sql = "select * from salesdb";
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement(sql);
            rss = (ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public ResultSet salesReport(Date date){
        String sql = "select * from salesdb where date = '"+date+"'";
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement(sql);
            rss = (ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public String salesTotal(){
        String total="";
        try {
            String filtersql = "select sum(price) from salesdb";
            con = DBConnection.connectDB();
            st = con.prepareStatement(filtersql);
            rss = (ResultSet) st.executeQuery();
            while(rss.next()){
                total = rss.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public String salesTotal(Date date){
        String total="";
        try {
            String filtersql = "select sum(price) from salesdb where date = '"+date+"'";
            con = DBConnection.connectDB();
            st = con.prepareStatement(filtersql);
            rss = (ResultSet) st.executeQuery();
            while(rss.next()){
                total = rss.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public ResultSet viewDealer(){
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from dealerdb");
            rss = (java.sql.ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public ResultSet viewSeller(){
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from sellerdb");
            rss = (java.sql.ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public ResultSet viewCategory(){
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
