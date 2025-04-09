/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionclima;

/**
 *
 * @author Estudiantes
 */
public class Condicionclima {

    public static void main(String[] args) {
        String clima = "soleado";
        
        if (clima == "lluvioso"){
           System.out.println("abrigarse");
           System.out.println("llevar paraguas");
           System.out.println("usar guantes");
        } else if(clima == "soleado"){
            System.out.println("beber agua");
            System.out.println("usar bloqueador");
            System.out.println("cubrirse del sol");
        }else {
            System.out.println(es otra estacion...);
        }
    }
}