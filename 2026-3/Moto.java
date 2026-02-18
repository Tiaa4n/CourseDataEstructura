public class Moto {
   
    private int Modelo;
    private String Marca;
    private String Color;
    private double Cilindraje;
    private double Precio;
    public Moto(int Modelo, String Marca, String Color, double Cilindraje, double Precio) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Color = Color;
        this.Cilindraje = Cilindraje;
        this.Precio = Precio;
    }
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        this.Color = color;
    }
    public double getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(double cilindraje) {
        this.Cilindraje = cilindraje;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public String realizarMantenimiento(String mtto){
        return"Mantenimiento realizado fue " + mtto;
    }
    
    @Override
    public String toString() {
        return "Moto [modelo=" + Modelo + ", marca=" + Marca + ", color=" + Color + ", cilindraje=" + Cilindraje
                + ", precio=" + Precio + "]";
    }
    
    
    

}