
package Guia3Ejercicio2;


public class Cuenta {
    //private int nroCuenta;
    private String titular;

    public Cuenta(String titular) {
        //this.nroCuenta = nroCuenta;
        this.titular = titular;
    }

//    public int getNroCuenta() {
//        return nroCuenta;
//    }
//
//    public void setNroCuenta(int nroCuenta) {
//        this.nroCuenta = nroCuenta;
//    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Titular: " + titular;
    }
    
    public void operacionExtraer(int tipoCuenta, double importe){
        if (tipoCuenta == 1) {
            
        }
    }
    
    
}
