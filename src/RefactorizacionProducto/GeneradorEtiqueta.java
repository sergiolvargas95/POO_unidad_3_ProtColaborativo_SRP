package RefactorizacionProducto;

public class GeneradorEtiqueta {
    public String generarEtiqueta(Producto producto, double precioFinal) {
        return "Producto: " + producto.getNombre() + ", Precio: " + precioFinal;
    }
}
