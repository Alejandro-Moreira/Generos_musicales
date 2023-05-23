public class Bicicleta {
    String tipo;
    int marchas;

    //establecer o setters
    public void establecertipo(String miTipo) {
        tipo = miTipo;
    }

    public void establecermarchas(int misMarchas) {
        marchas = misMarchas;
    }
    //obtener o getters
    public String obtenertipo() {
    return tipo;
    }

    public int obtenermarchas() {
    return marchas;
    }
//mastrar mensaje
    public void imprimirtipo() {
        System.out.println("Tipo:"+tipo);
    }

    public void imprimirmarchas() {
        System.out.println("Marchas:"+marchas);
    }
}
