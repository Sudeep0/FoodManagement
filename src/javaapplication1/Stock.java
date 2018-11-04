/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Bishal
 */
 class Stock{
     int s_id;
     String s_name;
     Date date;
     int s_quantity;
     
 

   public Stock(int id, String name, Date date, int quantity){
    this.s_id= id; 
    this.s_name=name;
    this.date=date;
    this.s_quantity=quantity;
    
    }
    
      public int getsid(){
        return s_id;
    }
    public String getsname(){
        return s_name;
    }
 public int getsdays(){
     long num=0;
     try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=ProduceInfo;user=bishal;password=bishal";
            Connection con = DriverManager.getConnection(url);
           String query="SELECT Best_for FROM Products where Name ="+"'"+s_name+"'";
          // System.out.println(query);
           
         //  System.out.println(s_name);
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query);
   
   while(rs.next()) {

         num =(rs.getInt("Best_for"));
}
     }
     catch(ClassNotFoundException | SQLException Ex){
            System.out.println("Error : "+Ex);}
    Date date1 = new Date();
   long difference = (date1.getTime()-date.getTime())/86400000 ;
     
   System.out.println(difference);
     
  
       return (int) (num-difference);
    
 
 }
    
    public int getsquantity(){
    
    return s_quantity;}
}
