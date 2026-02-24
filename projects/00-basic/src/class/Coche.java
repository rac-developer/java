public class Coche {
    String marca = "Toyota";
    String modelo = "Corolla";
    String color = "Rojo";
    int ano = 2020;
    double precio = 20000;

    void conducir() {
        System.out.println("El coche está conduciendo.");
    }

    void frenar() {
        System.out.println("El coche está frenando.");
    }

    void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + ano);
        System.out.println("Precio: $" + precio);
    }
}
