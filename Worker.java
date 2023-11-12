/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la4ownex;


public class Worker {
    private String name ;
    private double salary ;
    static int count=0;
    
    public Worker (String name ,double salary ){
        setName(name );
        setSalary (salary );
        count++;
        
    }
    
    
   void setName(String name){
       this.name=name;
   }
   
   void setSalary(double salary){
       if(salary<=0)
         throw new IllegalArgumentException(" salary must be greater than zero");
       this.salary=salary;
   }
}
