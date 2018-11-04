/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bishal
 */
public class Connect {
    
        
        
  // Connection con;
   Statement st;
 ResultSet rs;
   
    int ID; 
   int Name;
    int Days;
  
        
         
            
        
        

    
    public Connect(){}
    public Connect(int id, int name, int days){
    
        ID=id;
      Name =name;
        Days=days;
        
        
		try{	
	String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=ProduceInfo;user=bishal;password=bishal"; //username and password and databasename
          Connection con =DriverManager.getConnection(connectionURL);
            //System.out.println("You are connected");
            
            //Executes the statement on the database
            st =con.createStatement();
               rs=st.executeQuery("select * from Produce_Info");

		
          System.out.println("Connected");
         String query ="insert into Produce_Info values(1,2,3)";
			st.executeQuery(query);
                        //con.close();
        }catch (SQLException Ex){
        System.out.println("Errorrr: "+Ex);
        }
		
			
			
			}
	
	
	
    
   
    
    
    public void Insert(){
       
        try{
           rs=st.executeQuery("select * from Produce_Info");
         String query ="insert into Produce_Info values(1,2,3)";
			st.executeQuery(query);
                        //con.close();
        }catch (SQLException Ex){
        System.out.println("Errorrr: "+Ex);
        }
    
    }
    
    
    public void Display(){
    try{
        
        //Gets metadata
                 	ResultSetMetaData Rsmd = rs.getMetaData();
			System.out.println(Rsmd.getColumnName(1)+"     "+Rsmd.getColumnName(2)+"      "+Rsmd.getColumnName(3));
        
    rs=st.executeQuery("select * from Produce_Info");
			
			//Prints the result
			while (rs.next()) {
			 ID = rs.getInt(1);
			//Name =rs.getString(2);
			int days =rs.getInt(3);
			System.out.println(ID+"              "+Name+"            "+days);}
                        
                        }
    catch (SQLException Ex){
        System.out.println("Error: "+Ex);
    }
    }
    
    
    
    
}
