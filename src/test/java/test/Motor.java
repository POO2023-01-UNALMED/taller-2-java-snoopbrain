package test;
public class Motor {
    int registro;
    String tipo;
    int numeroCilindros;
    
    void cambiarRegistro(int registro) {
    this.registro = registro;
    }

    void asignarTipo(String tipo) {
    if (tipo.equals("gasolina") || tipo.equals("electrico")) {
        this.tipo = tipo;
        }
    }
}