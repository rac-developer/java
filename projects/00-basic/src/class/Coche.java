
public class Coche {
    // String marca;
    // int ano;
    // double precio;

    // Coche(String marca, int ano, double precio) {
    //     this.marca = marca;
    //     this.ano = ano;
    //     this.precio = precio;
    //     System.out.println("Se ha creado un nuevo coche.");
    // }

    // void manejar() {
    //     System.out.println("El coche " + this.marca + " está siendo manejado.");
    // }

    String marca = "Ford";
    String modelo = "Mustang";
    String color = "Rojo";
    int ano = 2021;

    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", ano=" + ano +
                '}';
    }
}
