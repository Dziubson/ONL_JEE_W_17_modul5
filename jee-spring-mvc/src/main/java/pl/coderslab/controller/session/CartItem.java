package pl.coderslab.controller.session;

public class CartItem {

    private int quantity;
    private Product product;

    public CartItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
