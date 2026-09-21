public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    
//CONSTRUCTORES
    public Cuenta() {
    }
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
//GET Y SET
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }
    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }
    public int getNumeroRetiros() {
        return numeroRetiros;
    }
    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }
    public float getTasaAnual() {
        return tasaAnual;
    }
    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }
    public float getComisionMensual() {
        return comisionMensual;
    }
    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
//METODOS DE OPERACION BANCARIA
    public void consignar(float cantidad) {
        this.saldo += cantidad;
        this.numeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.numeroRetiros++;
        } else {
            System.out.println("Saldo insuficiente.El monto a retirar es superior al que tiene en la cuenta");
        }
    }

    public void calcularInteres() {
        float interesMensual = (this.tasaAnual / 12) / 100;
        this.saldo += this.saldo * interesMensual;
    }

    public void extractoMensual() {
        this.saldo -= this.comisionMensual;
        this.calcularInteres();
    }

}

