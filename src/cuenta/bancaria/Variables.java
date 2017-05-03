/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

/**
 *
 * @author INTEL 2.6
 */
public class Variables {

    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo += 10;
    }
    
    public static void sumarSaldo(int saldo){
        saldo += 10;
    }
    
    
    public static void main(String[] args) {
        //10 OBJETOS CUENTA BANCARIA
        
        CuentaBancaria ct1 = new CuentaBancaria();
        CuentaBancaria ct2 = new CuentaBancaria();
        CuentaBancaria ct3 = new CuentaBancaria();
        CuentaBancaria ct4 = new CuentaBancaria();
        CuentaBancaria ct5 = new CuentaBancaria();
        CuentaBancaria ct6 = new CuentaBancaria();
        CuentaBancaria ct7 = new CuentaBancaria();
        CuentaBancaria ct8 = new CuentaBancaria();
        CuentaBancaria ct9 = new CuentaBancaria();
        CuentaBancaria ct10 = new CuentaBancaria();
        
        
        //DATOS DE LOS OBJETOS
   
        ct1.saldo = 1000;
        ct1.titular = "Cualquiera Chafa";
        ct1.numero = 123456789;
        ct2.saldo = 900;
        ct2.titular = "Pedro Camacho";
        ct2.numero = 987654321;
        ct3.saldo = 800;
        ct3.titular = "Ines Pilay";
        ct3.numero = 103456789;
        ct4.saldo = 700;
        ct4.titular = "Estefania Cedeño";
        ct4.numero = 134678974;
        ct5.saldo = 600;
        ct5.titular = "Cielo Water";
        ct5.numero = 345670456;
        ct6.saldo = 500;
        ct6.titular = "Elga Pataki";
        ct6.numero = 218690043;
        ct7.saldo = 300;
        ct7.titular = "Elle Lawliet";
        ct7.numero = 357111317;
        ct8.saldo = 400;
        ct8.titular = "Arnold Guzman";
        ct8.numero = 985245675;
        ct9.saldo = 100;
        ct9.titular = "Lalo Landa";
        ct9.numero = 330506004;
        ct10.saldo = 200;
        ct10.titular = "Cualquiera Chafa";
        ct10.numero = 123456789;
        
        //MODIFICAR SALDO
        sumarSaldo(ct1);
        sumarSaldo(ct2);
        sumarSaldo(ct2);
        sumarSaldo(ct3);
        sumarSaldo(ct3);
        sumarSaldo(ct3);
        sumarSaldo(ct4);
        sumarSaldo(ct5);
        sumarSaldo(ct5);
        sumarSaldo(ct6);
        sumarSaldo(ct6);
        sumarSaldo(ct6);
        sumarSaldo(ct7);
        sumarSaldo(ct7);
        sumarSaldo(ct7);
        sumarSaldo(ct7);
        sumarSaldo(ct8);
        sumarSaldo(ct9);
        sumarSaldo(ct9);
        sumarSaldo(ct9);
        sumarSaldo(ct10);
        sumarSaldo(ct10);
        sumarSaldo(ct10);
        sumarSaldo(ct10);
        
        //IMPRIMIR DATOS CUENTA BANCARIA
        System.out.println("Titular de la cuenta: " + ct1.titular);
        System.out.println("numero de cuenta: " + ct1.numero);
        System.out.println("Saldo: " + ct1.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct2.titular);
        System.out.println("numero de cuenta: " + ct2.numero);
        System.out.println("Saldo: " + ct2.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct3.titular);
        System.out.println("numero de cuenta: " + ct3.numero);
        System.out.println("Saldo: " + ct3.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct4.titular);
        System.out.println("numero de cuenta: " + ct4.numero);
        System.out.println("Saldo: " + ct4.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct5.titular);
        System.out.println("numero de cuenta: " + ct5.numero);
        System.out.println("Saldo: " + ct5.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct6.titular);
        System.out.println("numero de cuenta: " + ct6.numero);
        System.out.println("Saldo: " + ct6.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct7.titular);
        System.out.println("numero de cuenta: " + ct7.numero);
        System.out.println("Saldo: " + ct7.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct8.titular);
        System.out.println("numero de cuenta: " + ct8.numero);
        System.out.println("Saldo: " + ct8.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct9.titular);
        System.out.println("numero de cuenta: " + ct9.numero);
        System.out.println("Saldo: " + ct9.saldo);
        System.out.println();
        System.out.println("Titular de la cuenta: " + ct10.titular);
        System.out.println("numero de cuenta: " + ct10.numero);
        System.out.println("Saldo: " + ct10.saldo);
        System.out.println();
        
    }
    
}
