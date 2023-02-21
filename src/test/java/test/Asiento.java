package test;
public class Asiento {
    private String color;
    private int precio;
    private int registro;
    
    // Constructor
    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }
    
    public void cambiarColor(String color) {
        if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")) 
        {
            this.color = color;
        }
    }
}