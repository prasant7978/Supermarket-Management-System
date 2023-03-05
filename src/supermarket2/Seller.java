package supermarket2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

class Seller extends Employee{
    
    @Override
    public boolean loginEmployee(String uname,String password){
        try {
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from sellerdb where sellername='"+uname+"' and sellerpass='"+password+"'");
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

    public void updateStocks(int id,int remQty,int quantity){
        try{
            con = DBConnection.connectDB();
            int updateQty = remQty - quantity;
            String query = "update productdb set productQuantity='"+updateQty+"' where productId="+id;
            java.sql.Statement st = con.createStatement();
            st.executeUpdate(query);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    
    public ResultSet filterTable(String category){
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from productdb where productCatagory = '"+category+"'");
            rss = (java.sql.ResultSet) st.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rss;
    }
    
    public void addCustomerDetails(String customerName,String customerPhone,String userName){
        try {
                Connection conn=DBConnection.connectDB();
                PreparedStatement sst=(PreparedStatement)conn.prepareStatement("select sellerid from sellerdb where sellername = '"+userName+"'");
                rss = sst.executeQuery();
                rss.next();
                String id = rss.getString(1);
                String sql = "insert into customerdb (custname,custphone,sellerid) values (?,?,?)";
//                PreparedStatement st=(PreparedStatement)conn.prepareStatement("insert into customerdb values(?,?,?)");
                PreparedStatement st=(PreparedStatement)conn.prepareStatement(sql);
                st.setString(1,customerName);
                st.setString(2, customerPhone); 
                st.setString(3, id); 
                int z=st.executeUpdate();
                conn.close();
            }catch (HeadlessException | NumberFormatException | SQLException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public int addSalesDetails(int j,Date date,String productName,String proQuantity,String total){
        try {
            Connection conn=DBConnection.connectDB();
            PreparedStatement st=(PreparedStatement)conn.prepareStatement("insert into salesdb values(?,?,?,?,?)");
            j++;
            st.setInt(1, j);
            st.setDate(2, new java.sql.Date(date.getTime()));
            st.setString(3, productName);   
            st.setString(4, proQuantity);
            st.setString(5, String.valueOf(total));
            int z=st.executeUpdate();
            conn.close();
            }catch (HeadlessException | NumberFormatException | SQLException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
        return j;
   } 
    
}
