public class Libro_Calificaciones {
    private String nombreDeCurso;

    public void establecerNombreDeCurso(String nombre) {
        nombreDeCurso = nombre;
    }

    public String obtenerNombreDeCurso() {
        return nombreDeCurso;
    }

    public void mostrarMensaje() {
        System.out.printf("Bienvenido al libro de calificacones para \n%s!\n", obtenerNombreDeCurso());
    }
}
