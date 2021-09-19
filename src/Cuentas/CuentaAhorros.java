package Cuentas;

public class CuentaAhorros extends Cuenta {
    private double cuotamantenimiento;

    public CuentaAhorros(double cuotamantenimiento, String c, String n, double s, double i) {
        super(c, n, s, i);
        this.cuotamantenimiento = cuotamantenimiento;
    }

    public double getCuotamantenimiento() {
        return cuotamantenimiento;
    }

    public void setCuotamantenimiento(double cuotamantenimiento) {
        this.cuotamantenimiento = cuotamantenimiento;
    }
    
    
}
