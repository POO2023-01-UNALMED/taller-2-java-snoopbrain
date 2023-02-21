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
    
    // Getters y setters
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public int getRegistro() {
        return registro;
    }
    
    public void setRegistro(int registro) {
        this.registro = registro;
    }
}