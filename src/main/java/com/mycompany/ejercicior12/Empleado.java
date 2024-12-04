/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior12;
public class Empleado {
  
    
    public static double obtener_salario(double NHT, double VHN) {
        double salario, HET, HEE8;
        if (NHT>40) {
                HET = NHT-40;
        
                if (HET>8) {
                        HEE8 = HET -8;
                        return 40*VHN+16*VHN+HEE8*3*VHN;
                }
                else {
                        return 40*VHN+HET*2*VHN;
                    }
        }
        else {
            return NHT*VHN;          
        } 
    }
        
}
    

