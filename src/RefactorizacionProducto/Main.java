package RefactorizacionProducto;

public class Main {
    public static void main(String[] args) {
        
        Producto producto = new Producto("Laptop", 3600000.0, 0.18);

        
        CalculadorPrecio calculador = new CalculadorPrecio();
        double precioFinal = calculador.calcularPrecioFinal(producto);

        
        GeneradorEtiqueta generadorEtiqueta = new GeneradorEtiqueta();
        String etiqueta = generadorEtiqueta.generarEtiqueta(producto, precioFinal);

        System.out.println(etiqueta);
    }
}
