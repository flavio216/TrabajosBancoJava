
package Guia3Ejercicio2;


public class cuentaCorriente extends Cuenta {
    private int cbu;
    private double saldo;

    public cuentaCorriente(int cbu, double saldo, String titular) {
        super(titular);
        this.saldo = saldo;
        this.cbu = cbu;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cuenta Corriente " + " | Cbu: "+ cbu + " | Saldo: " + saldo;
    }
    
}
