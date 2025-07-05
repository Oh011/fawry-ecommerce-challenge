import java.util.List;

public class ReceiptPrinter {

    public void print(List<CartItem> items, double subTotal, double shipping, double total, double remainingBalance) {
        System.out.println("-----------------------------------------------------");

        System.out.println("** Checkout receipt **");


        for (CartItem item : items){

            Product product=item.getProduct();
           
            double price=product.getPrice();

            System.out.println("item : "+product.getName()+" , Quantity :"+item.getQuantity()+" , price : "+
                    price+" , total : "+price*item.getQuantity());
        }

        System.out.println("----------------------------------------------------------");

        System.out.println("Subtotal : "+subTotal);
        System.out.println("Shipping : "+shipping);
        System.out.println("Total :" + total);

        System.out.println("Customer balance :"+remainingBalance);
    }
}
