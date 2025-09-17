package modelos;

public class Credito extends Cuenta {

    private double valorPrestado;
    private double tasa;
    private int plazo;
    private double valorRetirado;

    public Credito(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    @Override
    public boolean retirar(double cantidad) {
        if (valorPrestado - valorRetirado >= cantidad) {
            valorRetirado += cantidad;
            return true;
        } else {
            System.out.println("Ya fue retirado todo el capital del préstamo o la cantidad supera lo disponible");
            return false;
        }
    }

    public double getCuota() {
        return valorPrestado * Math.pow(1 + tasa, plazo) * tasa / (Math.pow(1 + tasa, plazo) - 1);
    }

}
