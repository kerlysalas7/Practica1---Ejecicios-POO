/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author PC
 */
public class CuentaBancaria {
    
    String nombre;
    String apellido;
    String tipodecuenta;
    double saldo;    

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, String apellido, String tipodecuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodecuenta = tipodecuenta;
        this.saldo = saldo;
    }
    
    void depositar(double monto)
    {
        System.out.println("Su saldo inicial es $"+saldo);
        
         saldo = monto + saldo;
         
         System.out.println("Su nuevo saldo es de $"+saldo+" deposito exitoso");
    }
    void retirar(double monto)
    {
        System.out.println("Su saldo actual es de: $"+saldo);
        
        if(monto < saldo)
        {
            saldo = saldo - monto;
        }else
        {
            System.out.println("Saldo insuficiente");
        }
    }
    void mostrarSaldo()
    {
        System.out.println("Datos de la cuenta bancaria");
        System.out.println("Titular: "+nombre+" "+apellido);
        System.out.println("Tipo de Cuenta: "+ tipodecuenta);
        System.out.println("Saldo Actual: $"+saldo);
    }
    
}
