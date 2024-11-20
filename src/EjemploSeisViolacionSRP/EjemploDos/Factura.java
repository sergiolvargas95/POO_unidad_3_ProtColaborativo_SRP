package EjemploSeisViolacionSRP.EjemploDos;

public class Factura {
    private double monto;
    public double calcularImpuestos() {
        return monto * 0.12;
    }
    public void imprimirFactura() {
    System.out.println("Imprimiendo factura...");
    }
    
    public void guardarFactura() {
    System.out.println("Guardando factura en la base de datos...");
    }
}
