public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.mostrarInformacion();

        miCoche.conducir();
        miCoche.frenar();

        System.out.println();

        Coche miCoche2 = new Coche();
        miCoche2.mostrarInformacion();

    }
}