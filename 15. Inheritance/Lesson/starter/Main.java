import product.*;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);
        shirt.fold();

        Pants pants = new Pants(49.99, "Black", "Levis", 32,32);
        pants.fold();

        productStore(shirt);
        productStore(pants);

        System.out.println(shirt.toString());
    }

    public static void productStore(Product product) {
        System.out.println("\nThank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ".  Your total comes to " + product.getPrice());
        product.wear();
    }


}
