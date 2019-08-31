/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author s109e10
 */
public class Operadores {
    
    private static int numeroA;
     private static int numeroB;
     
   public static void main(String [] args)
   {
       numeroA = 10;
       numeroB = 5;
       
       //Operador módulo
       int resultadoModulo = numeroA % 2;
       System.out.println("El módulo de "+numeroA+" es "+resultadoModulo);
       
       //Operador incremento forma corta
       int resultadoIncremento = numeroA++;
       System.out.println("El resultado de incremento es "+resultadoIncremento);
       
           //Operador incremento forma larga
       numeroA=numeroA+1;
       System.out.println("El resultado de incremento es "+numeroA);
       
        //Operador decremento
       numeroB--;
       numeroB=numeroB-1;
       int resultadoDecremento = numeroB++;
       System.out.println("El resultado de incremento es "+resultadoDecremento);
       
       //Variable booleana tiene dos opciones (true, false)
       boolean estaVivo = true;
       estaVivo =  !estaVivo;
       System.out.println("El valor de boolean es: "+estaVivo);
       
       
       //Sentencia condicional if
       if (estaVivo == true) {
           System.out.println("Está vivo");
       }
       else
       {
           System.out.println("No está vivo");
       }
       

       //Sentencia condicional switch
       
       String inicialNombre = "A";
       switch(inicialNombre)
       { 
           case "A":
               System.out.println("Caso A"); 
           break;
           
           case "B":
               System.out.println("Caso B"); 
           break;
           
           default:
               System.out.println("Caso por defecto");
           break;
       }
   }
    
}
