
public class Pizza {
    String pan = "";
    String salsa = "";
    String queso = "";
    String topping = "";

   Pizza(String pan, String salsa, String queso, String topping) {
        this.pan = pan;
        this.salsa = salsa;
        this.queso = queso;
        this.topping = topping;
    }

    Pizza(String pan, String salsa, String queso) {
        this.pan = pan;
        this.salsa = salsa;
        this.queso = queso;
    }
    
    // ....
}
