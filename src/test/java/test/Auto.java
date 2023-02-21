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
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    String verificarIntegridad() {
        if (registro==motor.registro){
            for(Asiento e: asientos){
                if(e!=null){
                    if(e.registro!=registro){
                        return "Las piezas no son originales";
                        
                    }
                }
            }
        
            return "Auto original";
    }

    return "Las piezas no son originales";
}
}


