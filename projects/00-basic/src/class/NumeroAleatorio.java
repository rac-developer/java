
import java.util.Random;

public class NumeroAleatorio {

    // Variables globales
    Random random;
    int numero;


    public NumeroAleatorio() {
        // Variables locales
        Random random = new Random();
        int numero = 0;
        aleatorio(random, numero);
    }

    void aleatorio(Random random, int numero) {
        numero = random.nextInt(6) + 1;
        System.out.println(numero);
    }
}
