package tema.uno.tda.prestamos;

public class Cliente {
    private String nombre_c;
    private String a_paterno;
    private String a_materno;
    private String n_control;

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getN_control() {
        return n_control;
    }

    public void setN_control(String n_control) {
        this.n_control = n_control;

    }

    public Cliente(String nombre_c, String a_paterno, String a_materno, String n_control) {
        this.nombre_c = nombre_c;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.n_control = n_control;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre_c='" + nombre_c + '\'' +
                ", a_paterno='" + a_paterno + '\'' +
                ", a_materno='" + a_materno + '\'' +
                ", n_control='" + n_control + '\'' +
                '}';
    }
}
