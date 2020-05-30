
package Guia3Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {
    Scanner lector = new Scanner(System.in);
    int nroCbu = 0;
    public boolean validarEntre(int opc,int Min, int Max){
        return opc >= Min && opc <= Max;
    }
    
    public void registrarCuenta(int tipoDeCuenta, ArrayList<cajaDeAhorro> cda, ArrayList<cuentaCorriente> ccc){
        if (tipoDeCuenta == 1) {
            nroCbu++;
            System.out.println("Nombre del titular de la cuenta...");
            String titular = lector.nextLine();
            lector.nextLine();       
            System.out.println("Ingrese el saldo inicial...");
            double saldo = lector.nextDouble();
            
            cajaDeAhorro ca = new cajaDeAhorro(nroCbu, saldo, titular);
            cda.add(ca);
            System.out.println("Cuenta registrada con éxito... Su CBU es "+nroCbu+".");
        }
        
        if (tipoDeCuenta == 2) {
            nroCbu++;
            System.out.println("Nombre del titular de la cuenta...");
            String titular2 = lector.nextLine();
            lector.nextLine();
            System.out.println("Ingrese el saldo inicial...");
            double saldo = lector.nextDouble();
            
            cuentaCorriente cc = new cuentaCorriente(nroCbu, saldo, titular2);
            ccc.add(cc);
            System.out.println("Cuenta registrada con éxito... Su CBU es "+nroCbu+".");
        }
    }
    
    
    public void depositarDinero(ArrayList<cajaDeAhorro> cda, ArrayList<cuentaCorriente> ccc, int cbu ,double saldo)
    {
        double saldoAnterior;
        for (int i = 0; i < cda.size(); i++) {
            if(cda.get(i).getCbu() == cbu){   
                saldoAnterior = cda.get(i).getSaldo();
                saldo += saldoAnterior;
                cda.get(i).setSaldo(saldo);
                System.out.println("Se ha depositado con exito...");
            }
        }
        for (int i = 0; i < ccc.size(); i++) {
            if(ccc.get(i).getCbu() == cbu){   
                saldoAnterior = ccc.get(i).getSaldo();
                saldo += saldoAnterior;
                ccc.get(i).setSaldo(saldo);
                System.out.println("Se ha depositado con exito...");
            }
        }   
    }
    
    public void extraerDinero(ArrayList<cajaDeAhorro> cda, ArrayList<cuentaCorriente> ccc, int cbu ,double saldo)
    {
        double saldoAnterior;
        for (int i = 0; i < cda.size(); i++) {
            if(cda.get(i).getCbu() == cbu){   
                saldoAnterior = cda.get(i).getSaldo();
                saldo = saldoAnterior - saldo;
                if (saldo >= 0) {
                    cda.get(i).setSaldo(saldo);
                    System.out.println("Se ha extraído co exito....");
                }
                else{
                    System.out.println("Error: Saldo insuficiente... Tu saldo actual es de "+saldoAnterior);
                }
            }
        }
        for (int i = 0; i < ccc.size(); i++) {
            if(ccc.get(i).getCbu() == cbu){   
                saldoAnterior = ccc.get(i).getSaldo();
                saldo = saldoAnterior - saldo;
                if (saldo >= -10000) {
                    ccc.get(i).setSaldo(saldo);
                    System.out.println("Se ha extraído con exito...");
                }
                else{
                    System.out.println("Error: No puede superar el valor negativo de 10000... Tu saldo actual es de "+saldoAnterior);
                }
            }
        }   
    }
}

