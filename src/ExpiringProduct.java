public class ExpiringProduct  extends Product  implements Expirable  {

   private boolean isExpired;


   public ExpiringProduct(String name, double price, int quantity, boolean expired) {


      super(name,price,quantity);

      this.isExpired=expired;

   }


   public void SetExpiration(boolean IsExpired){

      this.isExpired=IsExpired;
   }


   public boolean isExpired() {
      return isExpired;
   }
}
