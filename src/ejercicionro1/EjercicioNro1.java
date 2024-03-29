package ejercicionro1;

import automotores.Carro;
import java.util.*;



/**
 *
 * @author Maria Isabel
 */
public class EjercicioNro1 {

    /**
     * int sirve para declarar números enteros double sirve para declarar
     * números decimales(También permite enteros)
     */
    public static void main(String[] args) {
 
        //******************PARTE 1 ***********************//
        
        Scanner scanner = new Scanner(System.in);
        //String nombre= "Maria IsabelA";

        System.out.print("Ingrese su nombre ");
        String nombre = scanner.next();
        // Llamado al procedimiento de imprimir nombre
        imprimirNombre(nombre);
        
        System.out.print("Ingrese el primer número ");
        double primerNumero = scanner.nextDouble();
        System.out.println("El numero ingresado es: "+primerNumero);
        
        System.out.print("Ingrese el segundo número "); 
        double segundoNumero = scanner.nextDouble();
        System.out.println("El numero ingresado es: "+segundoNumero);
        
        double resultadoSuma = sumar(primerNumero,segundoNumero);
        imprimirResultados(resultadoSuma, "Suma");
       
        double resultadoResta = restar(primerNumero,segundoNumero);
        imprimirResultados(resultadoResta, "Resta");
        
        double resultadoMultiplicacion = multiplicar(primerNumero,segundoNumero);
        imprimirResultados(resultadoMultiplicacion, "Multiplicación");
        
        double resultadoDivision = dividir(primerNumero,segundoNumero);
        imprimirResultados(resultadoDivision, "División");
        
        
        //******************PARTE 2 ***********************//
        
        
        Carro miPrimerCarro = new Carro("Azul", 4, 2008, "kia");
        Carro miSegundoCarro = new Carro("Rojo", 3, 2017, "nissan");
        miPrimerCarro.imprimirCarro();
        miSegundoCarro.imprimirCarro();
        double valorPrimerCarro = miPrimerCarro.valorCarro();
        System.out.println("El valor del primer carro es: "+valorPrimerCarro);
        double valorSegundoCarro = miSegundoCarro.valorCarro();
        System.out.println("El valor del segundo carro es: "+valorSegundoCarro);
    }

    /**
     * Procedimiento para imprimir un nombre
     */
    private static void imprimirNombre(String nombre) {
        //Comando para imprimir en consola
        System.out.println("Hola, mi nombre es: " + nombre);
    }

    /**
     * Función para sumar dos números
     * @param numeroUno Primer número para sumar
     * @param numeroDos Segundo número para sumar
     * @return La suma de número uno y número dos
     */
    private static double sumar(double numeroUno, double numeroDos) {
        double resultadoSuma = numeroUno + numeroDos;
        return resultadoSuma;
    }

    /**
     * Función para restar dos números
     */
    private static double restar(double numeroUno, double numeroDos) {
        double resultadoResta = numeroUno - numeroDos;
        return resultadoResta;
    }

    /**
     * Función para multiplicar dos números
     */
    private static double multiplicar(double numeroUno, double numeroDos) {
        double resultadoMultiplicacion = numeroUno * numeroDos;
        return resultadoMultiplicacion;
    }

    /**
     * Función para dividir número
     */
    private static double dividir(double numeroUno, double numeroDos) {
        double resultadoDivision = numeroUno / numeroDos;
        return resultadoDivision;
    }

    /**
     * Función para imprimir resultados de cualquier operación
     */
    private static void imprimirResultados(double resultado, String tipoOperacion) {
        System.out.println("El resultado de la "+tipoOperacion+" es: " + resultado);
    }

}

