/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Bishal
 */
class User {
    int ID; 
    String Name;
    int Days; 
 
   
    
    public User(int id, String name, int days){
    this.ID= id; 
    this.Name=name;
    this.Days=days;
    }
    
      public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
   
    public int getDays(){
        return Days;
    }
    
}
