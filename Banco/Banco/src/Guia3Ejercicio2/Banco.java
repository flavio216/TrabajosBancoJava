/*

Ejercicio 2 de la Guia 3
No comprendo como poder dejar espacios a la hora de ingresar cadenas de String por el lector.
Por ejemplo a la hora de ingresar el nombre del titular si ingreso "Facundo Roldan" automaticamente me rompe el programa,
mientras que si ingreso solamente "Facundo" me lo toma correctamente y no rompe...
¿Cual es la solución? Gracias!.
*/

package Guia3Ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Banco {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {   
        ArrayList cajaDeAhorro = new ArrayList();
        ArrayList cuentaCorriente = new ArrayList();
        menu(cajaDeAhorro, cuentaCorriente);         
    }
    
    public static void imprimirMenu(){
        System.out.println("++++++++++Bienvenido Al Banco Pirulos++++++++++");
        System.out.println("Por favor eliga la opción deseada...");
        System.out.println("1.- Regitrar Cuenta");
        System.out.println("2.- Depositar");
        System.out.println("3.- Extraer");
        System.out.println("4.- Mostrar Cuentas");
        System.out.println("0.- Salir");
    }
    
    public static void menu(ArrayList<cajaDeAhorro> cajaDeAHorro, ArrayList<cuentaCorriente> cuentaCorriente){
        Operaciones o = new Operaciones();
        int optMenu = -1;
        imprimirMenu();
        while(optMenu != 0){
            
            optMenu = lector.nextInt();
            if (o.validarEntre(optMenu, 0, 4)) {
                switch (optMenu) {
                    case 1:
                        System.out.println("Que tipo de cuenta deseas registrar... ");
                        System.out.println("[1] Caja de Ahorro, [2] Cuenta Corriente");
                        int tipoDeCuenta = lector.nextInt();
                        if (o.validarEntre(tipoDeCuenta, 1,2)) {
                            o.registrarCuenta(tipoDeCuenta, cajaDeAHorro, cuentaCorriente);
                        }
                        else{
                            System.out.println("Eligió una opción no valida.");
                        }
                        imprimirMenu();                        
                        break;
                    case 2:
                        if (!cajaDeAHorro.isEmpty() || !cuentaCorriente.isEmpty()) {
                            System.out.println("Ingrese el CBU...");
                            int cbu = lector.nextInt();
                            System.out.println("Ingrese el saldo a depositar...");
                            double saldo = lector.nextDouble();
                            o.depositarDinero(cajaDeAHorro, cuentaCorriente, cbu, saldo);
                        }
                        else{
                            System.out.println("[ERROR]No hay cuentas cargadas...");
                        }
                        imprimirMenu();
                        break;
                    case 3:
                        if (!cajaDeAHorro.isEmpty() || !cuentaCorriente.isEmpty()) {
                            System.out.println("Ingrese el CBU...");
                            int cbu = lector.nextInt();
                            System.out.println("Ingrese el saldo a extraer...");
                            double saldo = lector.nextDouble();
                            o.extraerDinero(cajaDeAHorro, cuentaCorriente, cbu, saldo);
                        }
                        else{
                            System.out.println("[ERROR]No hay cuentas cargadas...");
                        }
                        imprimirMenu();
                        break;
                    case 4:
                        mostrarCuentas(cajaDeAHorro,cuentaCorriente);  
                        break;
                    default:
                        System.out.println("Muchas gracias por usar nuestros servicios");
                        break;
                }
            }
            else{
                System.out.println("Ha elegido una opcion no valida. Recuerde que es entre 0 y 3");
            }
            
        }  
    }
    
    
    
    public static void mostrarCuentas(ArrayList<cajaDeAhorro>l1,ArrayList<cuentaCorriente>l2){
        System.out.println("////////////////CUENTAS CORRIENTES////////////////");
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i));
        }
        System.out.println("////////////////CAJAS DE AHORRO////////////////");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
