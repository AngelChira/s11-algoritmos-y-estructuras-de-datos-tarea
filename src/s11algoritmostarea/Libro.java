package s11algoritmostarea;

public class Libro {
    private String codigo;
    private String titulo;
    private String editorial;
    private String autor;
    private byte numeroEdicion;
    private short anioPublicacion;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String editorial, String autor, byte numeroEdicion, short anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.numeroEdicion = numeroEdicion;
        this.anioPublicacion = anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public byte getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(byte numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public short getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(short anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
}
