import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Cart {



   private List<CartItem> items=new ArrayList<>();


    public List<CartItem> getItems() {
        return List.copyOf(items);
    }




    public void add(Product product,int quantity){


        if (quantity <= 0) {


            System.out.println("Error: Quantity must be greater than zero.");
            return;

        }


        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                System.out.println("Product is already in cart");
                return;
            }
        }


        if(product.getQuantity()<=0){

            throw new ProductOutOfStockException(product.getName());
        }


        if (quantity > product.getQuantity()) {

            System.out.println("Error: Cannot add " + quantity + " x " + product.getName() +
                    ". Only " + product.getQuantity() + " in stock.");
            return;
        }


        items.add(new CartItem(product,quantity));

        System.out.println(quantity + " x " + product.getName() + " added to cart.");

    }


    public void updateQuantity(Product product, int quantity) throws InvalidQuantityException {


        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {


                if (quantity <= 0) {

                    items.remove(item);
                }

                else {


                    item.setQuantity(quantity);
                }
            }


        }

    }


    public void remove(Product product){


    for (CartItem item : items) {
        if (item.getProduct().equals(product)) {

            items.remove(item);
            }
        }
    }

    public  boolean isEmpty(){

        return items.isEmpty();
    }

}
