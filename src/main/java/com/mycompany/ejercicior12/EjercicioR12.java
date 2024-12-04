/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior12;
import java.util.Scanner;
public class EjercicioR12 {

    public static void main(String[] args) {
        double NHT, VHN, salario;
        String nombre;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        NHT = teclado.nextDouble();
        
        System.out.println("Ingrese el valor de la hora normal trabajada: ");
        VHN = teclado.nextDouble();
        
        salario = Empleado.obtener_salario(NHT, VHN);
        System.out.println("El trabajador: " + nombre + " devengo $ " + salario);
    }
}
