public class ProductOutOfStockException extends RuntimeException {
    public ProductOutOfStockException(String productName) {
        super("Product out of stock: " + productName);
    }
}