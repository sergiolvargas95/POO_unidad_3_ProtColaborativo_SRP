package RefactorizacionClaseLibro;

public class Libro {
    private String nombre;
    private String autor;
    private int anioPublicacion;
    private int numeroPaginas;

    public Libro(String nombre, String autor, int anioPublicacion, int numeroPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String mostrarLibro() {
        return "Libro { " + "\n" +
                " Año de publicacion = " + anioPublicacion +
                ", nombre = " + nombre + "\n" +
                ", autor = " + autor + "\n" +
                ", numero de Paginas = " + numeroPaginas + "\n" +
                '}';
    }
}
