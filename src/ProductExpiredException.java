public class ProductExpiredException extends RuntimeException {
    public ProductExpiredException(String productName) {
        super("Product is expired: " + productName);
    }
}