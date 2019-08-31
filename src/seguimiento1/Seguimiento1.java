/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento1;

import java.util.Scanner;

/**
 *
 * @author s109e10
 */
public class Seguimiento1 {
    
     private static String mes;
    
    
    public static void main(String[] args) {
 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes: ");
        int numeroIngresado = scanner.nextInt();
        
        switch(numeroIngresado)
       { 
           case 1:
            
            mes = "Enero";
            imprimir(mes);
           break;
           
           case 2:
            mes = "Febrero";
            imprimir(mes);
           break;
           
           case 3:
            mes = "Marzo"; 
            imprimir(mes);
           break;
           
           case 4:
            mes = "Abril";  
            imprimir(mes);
           break;
           
           case 5:
            mes = "Mayo";
            imprimir(mes);
           break;
           
           case 6:
            mes = "Junio";
            imprimir(mes);
           break;
           
           case 7:
            mes = "Julio"; 
            imprimir(mes);
           break;
           
           case 8:
            mes = "Agosto";
            imprimir(mes);
           break;
           
           case 9:
            mes = "Septiembre";
            imprimir(mes);
           break;
           
           case 10:
            mes = "Octubre"; 
            imprimir(mes);
           break;
           
           case 11:
            mes = "Noviembre";
            imprimir(mes);
           break;
           
           case 12:
             mes = "Diciembre";
             imprimir(mes);
           break;
           
           default:
             mes= "Mes ingresado no existe";
             imprimir(mes);
           break;
       }

    }

    private static void imprimir(String mesElegido) {
        System.out.println(mesElegido);
    }
}
