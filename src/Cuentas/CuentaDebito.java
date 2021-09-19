package Cuentas;

public class CuentaDebito extends Cuenta{    
    private double cuotaMantenimiento;
    private String chequera;
    private int numeracionInicial;
    private int numeracionFinal;

    public CuentaDebito(double cuotaMantenimiento, String chequera, int numeracionInicial, int numeracionFinal, String c, String n, double s, double i) {
        super(c, n, s, i);
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.chequera = chequera;
        this.numeracionInicial = numeracionInicial;
        this.numeracionFinal = numeracionFinal;
    }

    public String getChequera() {
        return chequera;
    }

    public void setChequera(String chequera) {
        this.chequera = chequera;
    }

    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public int getNumeracionFinal() {
        return numeracionFinal;
    }

    public void setNumeracionFinal(int numeracionFinal) {
        this.numeracionFinal = numeracionFinal;
    }

    public int getNumeracionInicial() {
        return numeracionInicial;
    }

    public void setNumeracionInicial(int numeracionInicial) {
        this.numeracionInicial = numeracionInicial;
    }
    
    
    
    
}
