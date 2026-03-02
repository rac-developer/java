
public class Main {
    public static void main(String[] args) {
        // int[] numeros = new int[3];
        // char[] caracteres = new char[4];
        // String[] cadenas = new String[5];

        Comida[] refrigerador = new Comida[3];

        Comida comida1 = new Comida("Pizza");
        Comida comida2 = new Comida("Hamburguesa");
        Comida comida3 = new Comida("Sushi");

        // refrigerador[0] = comida1;
        // refrigerador[1] = comida2;
        // refrigerador[2] = comida3;

        Comida[] refrigerador2 = {comida1, comida2, comida3};

        System.out.println(refrigerador[0].nombre);
        System.out.println(refrigerador[1].nombre);
        System.out.println(refrigerador[2].nombre);
    }
}