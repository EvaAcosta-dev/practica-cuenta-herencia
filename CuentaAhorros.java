public class CuentaAhorros extends Cuenta {
    
    protected boolean activa;

    //constructor vacio
    public CuentaAhorros(){}

    //constructor con los atributo heredados de la clase Cuenta
    public CuentaAhorros(float saldo,float tasa,boolean activa){
        super(saldo, tasa);
        this.activa = activa;   
     }
    //get y set
    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

   //metodos heredados de la clase Cuenta 
    @Override
    public void retirar(float cantidad) {
        if (activa){
        super.retirar(cantidad);
        }else {
            System.out.println("La cuenta esta inactiva.");
        }
    }


    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }

  @Override
    public void extractoMensual() {
        if (activa){
        super.extractoMensual();
        }
    }
    
    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones realizadas: " + (numeroConsignaciones + numeroRetiros));
    }
    
}

