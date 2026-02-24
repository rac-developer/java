
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("pan de pizza", "salsa de tomate", "queso mozzarella", "pepperoni");

        System.out.println("Pan: " + pizza.pan);
        System.out.println("Salsa: " + pizza.salsa);
        System.out.println("Queso: " + pizza.queso);
        System.out.println("Topping: " + pizza.topping);
        
        System.out.println();

        Pizza pizza2 = new Pizza("pan de pizza", "salsa de tomate", "queso mozzarella");

        System.out.println("Pan: " + pizza2.pan);
        System.out.println("Salsa: " + pizza2.salsa);
        System.out.println("Queso: " + pizza2.queso);
    }
}