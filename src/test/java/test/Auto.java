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
        int c = 0;
        for (Asiento a: this.asientos) {
            if (a != null) {
                c+=1;
            }
        }
        return c;
    }

    String verificarIntegridad() {
        if (registro==motor.registro){
            for(Asiento a: asientos){
                if(a!=null){
                    if(a.registro!=registro){
                        return "Las piezas no son originales";
                    }
                }
            }        
            return "Auto original";
        }
        return "Las piezas no son originales";
    }  
}


