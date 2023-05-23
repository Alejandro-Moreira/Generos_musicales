public class menu {
    public static void main(String[] args) {
        Transporte bus = new Transporte();   //bus es la instancia
        Transporte avion = new Transporte(); //avion es la instancia
        Transporte bicicleta = new Transporte(); //bicicleta es la instancia
        Transporte yate = new Transporte(); //yate es la instancia
        Transporte globo = new Transporte(); //globo es la instancia
        avion.disenio();
        bicicleta.motor();

        System.out.println(avion.capacidad);
        System.out.println(bicicleta.peso);
    }
}
