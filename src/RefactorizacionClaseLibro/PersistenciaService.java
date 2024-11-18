package RefactorizacionClaseLibro;

public class PersistenciaService {
    public String guardarLibro(Libro libro) {
        return "Guardando el libro: " + libro.getNombre();
    }
}
