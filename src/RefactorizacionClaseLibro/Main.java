package RefactorizacionClaseLibro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Java para principiantes", "Pedro Pablo", 2000, 450);

        ReportesService reporte = new ReportesService();
        PersistenciaService persistencia = new PersistenciaService();

        System.out.println(reporte.generarReporte(libro));
        System.out.println(persistencia.guardarLibro(libro));
    }
}
