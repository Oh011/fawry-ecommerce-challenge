public class Product {


    private String name;

    private double price;

    private int quantity;


    public Product(){

    }

    public Product(String name, double price, int quantity) {

        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void setPrice(double price) throws InvalidPriceException {


        if (price <= 0) {

            throw new InvalidPriceException("Product price must be greater than zero.");
        }

        this.price = price;
    }

    public void setQuantity(int quantity) throws InvalidQuantityException {

        if (quantity < 0) {

            throw new InvalidQuantityException("Product quantity cannot be negative.");
        }

        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product: " + name +
                ", Price: " + price +
                ", Quantity: " + quantity;
    }


}



