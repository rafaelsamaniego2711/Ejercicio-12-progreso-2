public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ana");
        MotorRecomendacion motor = new MotorRecomendacion(u);
        motor.recomendar("ia");
        motor.recomendar("seguridad");
        for (Curso c : u.getRecomendados()) System.out.println(c.info());
        System.out.println("¿Tiene Pentesting?: " + u.buscarCurso("Pentesting"));
    }
}
