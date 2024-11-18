package RefactorizacionProducto;

public class Main {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("Laptop", 3600000.0, 0.18);

        // Calcular el precio
        CalculadorPrecio calculador = new CalculadorPrecio();
        double precioFinal = calculador.calcularPrecioFinal(producto);

        // Generar la etiqueta
        GeneradorEtiqueta generadorEtiqueta = new GeneradorEtiqueta();
        String etiqueta = generadorEtiqueta.generarEtiqueta(producto, precioFinal);

        // Mostrar resultados
        System.out.println(etiqueta);
    }
}
