package modelos;

public class Credito extends Cuenta {

    private double valorPrestado;
    private double tasa;
    private int plazo;
    private double valorRetirado;

    public Credito(String titular, String numero,
            double valorPrestado, double tasa, int plazo) {
        super(titular, numero, 0);
        this.valorPrestado = valorPrestado;
        this.tasa = tasa;
        this.plazo = plazo;
        this.valorRetirado = 0;
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
        double t = tasa / 100;
        return valorPrestado * Math.pow(1 + t, plazo) * t / (Math.pow(1 + t, plazo) - 1);
    }

    public void pagar(double cantidad) {
        if (getSaldo() < valorPrestado) {
            var intereses = (valorPrestado - getSaldo()) * tasa/100;
            var abonoCapital = cantidad - intereses;
            consignar(abonoCapital);
        } else {
            System.out.println("Ya la deuda está pagada");
        }
    }

    public double getValorPrestado() {
        return valorPrestado;
    }

    public double getTasa() {
        return tasa;
    }

    public int getPlazo() {
        return plazo;
    }

    public double getValorRetirado() {
        return valorRetirado;
    }

}
