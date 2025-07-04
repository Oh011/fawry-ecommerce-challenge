import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheckOutService implements  ICheckOutService {


    private final double shippingFees=30;
    private final ReceiptPrinter receiptPrinter;
    private IShipmentService shipmentService;


    public CheckOutService(IShipmentService service,ReceiptPrinter printer){

        this.shipmentService=service;
        this.receiptPrinter=printer;
    }


    public void checkOut(Customer customer , Cart cart) throws InvalidQuantityException {


        if(cart.isEmpty())
            throw new EmptyCartException();




        double subTotal=0;

        List<CartItem> cartItems=cart.getItems();
        List<CartItem> shippableItems=new ArrayList<>();



        for(CartItem item: cartItems){


            if(item.getProduct().getQuantity()<=0){

                throw new ProductOutOfStockException(item.getProduct().getName());
            }

            if(item.getProduct() instanceof ExpiringProduct product){

                if(product.isExpired()){

                    throw new ProductExpiredException(product.getName());
                }
            }


            if(item.getProduct() instanceof Shippable ){

                shippableItems.add(item);
            }


            subTotal+=item.getProduct().getPrice() * item.getQuantity();

        }

        double amount=subTotal+shippingFees;


        if(customer.getBalance()<amount) {
            throw new InsufficientBalanceException(customer.getBalance(), amount);

        }

        else{



            this.shipmentService.ProcessShipment(shippableItems);

            double remainingBalance=customer.getBalance()-amount;

            this.receiptPrinter.print(cartItems,subTotal,shippingFees , amount,remainingBalance);


            // Reduce stock
            for (CartItem item : cartItems) {
                Product product = item.getProduct();
                int quantity = item.getQuantity();
                product.setQuantity(product.getQuantity() - item.getQuantity());
            }


        }




    }



}
