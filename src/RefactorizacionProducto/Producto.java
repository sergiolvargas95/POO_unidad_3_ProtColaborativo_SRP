package RefactorizacionProducto;

public class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }

    
    public String generarEtiqueta() {
        return "Producto: " + nombre + ", Precio: " + calcularPrecioFinal();
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getImpuesto() {
        return impuesto;
    }

    
}
