/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        
        CuentaBancaria cb = null;        
        do{
            
            System.out.println("\n Menu de la ESPE");
            System.out.println("1. Creacion de cuenta Bancaria");
            System.out.println("2. Deposito");
            System.out.println("3. Retiro");
            System.out.println("4. Mostrar datos de la cuenta bancaria");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op)
            {
                case 1:
                    System.out.println("\n CREACION DE CUENTA");
                    System.out.print("Titular: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido del titular: ");
                    String apellido = sc.nextLine();
                    System.out.print("Tipo de cuenta: ");
                    String tipodecuenta = sc.nextLine();
                    System.out.print("Saldo inicial: $");
                    double saldo = sc.nextDouble();
                
                    cb = new CuentaBancaria(nombre, apellido, tipodecuenta, saldo);
                    break;
                
                case 2:
                    System.out.println("Ingrese monto a depositar: $");
                    double monto = sc.nextDouble();
                    cb.depositar(monto);
                    break;
                    
                case 3:
                    System.out.println("Ingrese monto a retirar");
                    double retirar = sc.nextDouble();
                    cb.retirar(retirar);
                    break;
                    
                case 4:
                    cb.mostrarSaldo();
                    break;
                    
                case 5:
                    System.out.println("Gracias por escoger nuestro banco");
                    break;
                    
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
        
        sc.nextLine();
        
        }while(op != 5);
        sc.close();
    }
    
}
