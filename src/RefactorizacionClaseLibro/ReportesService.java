package RefactorizacionClaseLibro;

public class ReportesService {
    public String generarReporte(Libro libro) {
        return "Reporte del Libro:\n" + libro.mostrarLibro();
    }
}
