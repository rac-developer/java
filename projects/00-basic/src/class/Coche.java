
public class Coche {
    String marca;
    int ano;
    double precio;

    Coche(String marca, int ano, double precio) {
        this.marca = marca;
        this.ano = ano;
        this.precio = precio;
        System.out.println("Se ha creado un nuevo coche.");
    }

    void manejar() {
        System.out.println("El coche " + this.marca + " está siendo manejado.");
    }
}
