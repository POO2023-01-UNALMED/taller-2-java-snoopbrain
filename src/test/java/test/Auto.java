package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    int getCantidadAsientos() {
        int cantidad = 0;
        for (Asiento n: this.asientos) {
            if (n != null) {
                cantidad+=1;
            }
        }
        return cantidad;
    }

    String verificarIntegridad() {
        if (registro==motor.registro){
            for(Asiento n: asientos){
                if(n!=null){
                    if(n.registro!=registro){
                        return "Las piezas no son originales";
                    }
                }
            }        
            return "Auto original";
        }
        return "Las piezas no son originales";
    }  
}


