package tema.uno.tda;

public class Alumno {
    String Nombre;
    Byte edad;
    Integer grupo;
    String NControl;

    public Alumno(String nombre, Byte edad, Integer grupo, String NControl) {
        Nombre = nombre;
        this.edad = edad;
        this.grupo = grupo;
        this.NControl = NControl;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public String getNControl() {
        return NControl;
    }

    public void setNControl(String NControl) {
        this.NControl = NControl;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                ", grupo=" + grupo +
                ", NControl='" + NControl + '\'' +
                '}';
    }
}

