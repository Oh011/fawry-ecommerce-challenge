public interface ICheckOutService {

    public void checkOut(Customer customer , Cart cart) throws InvalidQuantityException;
}
