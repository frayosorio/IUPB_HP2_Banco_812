package modelos;

public class Transaccion {
    private Cuenta cuenta;
    private String tipo;
    private double valor;
    private double saldo;
    private boolean rechazada;
    
    public Transaccion(Cuenta cuenta, String tipo, double valor, double saldo, boolean rechazada) {
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.valor = valor;
        this.saldo = saldo;
        this.rechazada = rechazada;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isRechazada() {
        return rechazada;
    }

    
}

