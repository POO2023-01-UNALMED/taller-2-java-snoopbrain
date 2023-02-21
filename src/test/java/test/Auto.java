package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    int CantidadAsientos() {
        int c = 0;
        for (Asiento num: this.asientos) {
            if (num != null) {
                c+=1;
            }
        }
        return c;
    }

    String verificarIntegridad() {
        if (registro==motor.registro){
            for(Asiento num: asientos){
                if(num!=null){
                    if(num.registro!=registro){
                        return "Las piezas no son originales";
                    }
                }
            }        
            return "Auto original";
        }
        return "Las piezas no son originales";
    }  
}


