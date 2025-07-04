public class ShippedExpiringProduct extends ShippedProduct implements Expirable {



    private boolean expired;


    public ShippedExpiringProduct(){


    }


    public ShippedExpiringProduct(String name, double price, int quantity,
                                  double weight, WeightUnit weightUnit, boolean expired) {
        super(name, price, quantity, weight, weightUnit);
        this.expired = expired;
    }



    public double getWeight() {
        return weight;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public boolean isExpired() {
        return expired;
    }
}
