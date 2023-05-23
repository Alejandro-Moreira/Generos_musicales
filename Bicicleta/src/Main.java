// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bicicleta miBicilceta = new Bicicleta();
        Bicicleta tuBicilceta = new Bicicleta();
        Bicicleta otraBicilceta = new Bicicleta();
        //Instancias
        miBicilceta.establecermarchas(5);
        tuBicilceta.establecermarchas(3);
        otraBicilceta.establecermarchas(4);
        System.out.println(miBicilceta.obtenermarchas());
        System.out.println(tuBicilceta.obtenermarchas());
        System.out.println(otraBicilceta.obtenermarchas());

    }
}