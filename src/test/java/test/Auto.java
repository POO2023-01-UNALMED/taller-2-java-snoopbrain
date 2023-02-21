package test;
public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int getCantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String verificarIntegridad() {
        for (Asiento asiento : asientos){
            if (asiento !=null){
                if ((motor.registro != registro) || (asiento.registro != registro)){
                    return "Las piezas no son originales";
        }   
        }
        }
        return "Auto original";
    }
}


