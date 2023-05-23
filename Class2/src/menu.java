public class menu {
    public static void main(String[] args) {
        transporte avion = new transporte();
        transporte auto = new transporte();

        avion.frenar();
        auto.acelerar();

        System.out.println(avion.frenar);
        System.out.println(auto.acelerar);
    }
}
