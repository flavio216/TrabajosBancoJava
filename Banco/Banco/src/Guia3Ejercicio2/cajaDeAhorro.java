
package Guia3Ejercicio2;


public class cajaDeAhorro extends Cuenta {
    private int cbu;
    private double saldo;

        public cajaDeAhorro(int cbu, double saldo, String titular) {
        super(titular);
        this.cbu = cbu;
        this.saldo = saldo;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    
   
    @Override
    public String toString() {
        return super.toString() + " | Caja de Ahorro " + " | Cbu: "+ cbu + " | Saldo: " + saldo;
    }

    
}
