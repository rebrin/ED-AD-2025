package tema.uno.tda.prestamos;

public class Libro {
    private String id_libro;
    private String nombre;
    private String Editorial;

    public Libro(String id_libro, String nombre, String editorial) {
        this.id_libro = id_libro;
        this.nombre = nombre;
        Editorial = editorial;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", Editorial='" + Editorial + '\'' +
                '}';
    }
}
