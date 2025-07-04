public class ShippedProduct extends Product implements Shippable{


   protected    double weight;
   protected WeightUnit weightUnit;



   public ShippedProduct(){


   }


    public ShippedProduct(String name, double price, int quantity,double weight , WeightUnit weightUnit) {

       super(name,price,quantity);

       this.weight=weight;
       this.weightUnit=weightUnit;

    }

    @Override
    public double getWeight() {

        return this.weight;
    }

    @Override
    public WeightUnit getWeightUnit() {

        return this.weightUnit;
    }
}




