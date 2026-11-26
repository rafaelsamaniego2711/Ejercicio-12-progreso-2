import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Curso> recomendados = new ArrayList<>();

    public Usuario(String nombre) { this.nombre = nombre; }
    public ArrayList<Curso> getRecomendados() { return recomendados; }

    public boolean buscarCurso(String busq) {
        for (Curso c : recomendados) if (c.getNombre().equalsIgnoreCase(busq)) return true;
        return false;
    }
}
