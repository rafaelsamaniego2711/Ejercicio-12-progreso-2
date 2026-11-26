public abstract class Curso {
    protected String nombre, dificultad;

    public Curso(String nombre, String dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public String getNombre() { return nombre; }
    public String info() { return nombre + " (" + dificultad + ")"; }
}
