/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        try { 
            System.out.println("Enter an integral num :");    
        int x = in.nextInt();
        }catch (InputMismatchException e ){
            System.out.println(e);
            System.out.println(" you have entered invalid data !!!");
        }
       
        
        
        
    }
}
