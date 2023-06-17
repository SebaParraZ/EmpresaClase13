public class Usuario {
    private String nombre;
    private String fecha_de_nacimiento;
    private String run;

    public Usuario() {
        this.nombre = "";
        this.fecha_de_nacimiento = "";
        this.run = "";
    }

    public Usuario(String nombre, String fecha_de_nacimiento, String run) {
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fecha_de_nacimiento=" + fecha_de_nacimiento +
                ", run=" + run +
                '}';
    }
}