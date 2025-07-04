public class CartItem {


  private   Product product;

  private int quantity;



  public CartItem(Product product , int quantity){

      this.product=product;
      this.quantity=quantity;
  }


  public void setQuantity(int quantity) throws InvalidQuantityException {

      if(quantity<0)
          throw new InvalidQuantityException("Product quantity cannot be negative.");

      this.quantity=quantity;
  }


  public  Product getProduct(){

      return this.product;
  }


  public  int getQuantity(){

      return this.quantity;
  }
}
