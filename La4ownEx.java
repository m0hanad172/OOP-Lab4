/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la4ownex;


public class La4ownEx {

    public static void main(String[] args) {
       
        
        
        try{
            Worker w1=new Worker("Ali",20000);
            //Worker w2=new Worker("Mohanad"-40000); // will throw exception 
            Worker w3=new Worker("murat",30333);
            System.out.println(" workers num:"+Worker.count);
       }catch(Exception e ){
            System.out.println(e);
       }
        
      
        
    }
}
