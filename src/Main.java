import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void testCase1() {
        System.out.println("===== Test Case 1: No errors =====");

        try {
            Product cheese = new ShippedExpiringProduct("Cheese", 100.0, 5, 400, WeightUnit.GRAM, false);
            Product tv = new ShippedProduct("TV", 200.0, 2, 2.5, WeightUnit.KILOGRAM);
            Product scratchCard = new Product("Scratch Card", 50.0, 10);

            System.out.println("---------------------------------------------------");

            Customer customer = new Customer("Omar", 1000.0);

            Cart cart = new Cart();
            cart.add(cheese, 2);
            cart.add(tv, 1);
            cart.add(scratchCard, 1);

            System.out.println("---------------------------------------------------");


            IShipmentService shipmentService = new ShipmentService(new ShipmentWeightCalculator());
            ReceiptPrinter printer=new ReceiptPrinter();
            ICheckOutService checkoutService = new CheckOutService(shipmentService,printer);
            checkoutService.checkOut(customer, cart);

        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        }

        System.out.println();

        System.out.println("===================================================================");

    }


    public static void testCase2() {
        System.out.println("===== Test Case 2: Empty Cart =====");

        try {
            Customer customer = new Customer("Omar", 1000.0);
            System.out.println("---------------------------------------------------");

            Cart cart = new Cart();

            System.out.println("---------------------------------------------------");


            IShipmentService shipmentService = new ShipmentService(new ShipmentWeightCalculator());
            ReceiptPrinter printer=new ReceiptPrinter();
            ICheckOutService checkoutService = new CheckOutService(shipmentService,printer);
            checkoutService.checkOut(customer, cart);

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("===================================================================");

    }



    public static void testCase3() {
        System.out.println("===== Test Case 3: Insufficient Balance =====");

        try {
            Product tv = new ShippedProduct("TV", 500.0, 1, 2.5, WeightUnit.KILOGRAM);

            Customer customer = new Customer("Omar", 100.0); // Not enough for 500 + 30 shipping

            System.out.println("---------------------------------------------------");

            Cart cart = new Cart();
            cart.add(tv, 1);

            System.out.println("---------------------------------------------------");


            IShipmentService shipmentService = new ShipmentService(new ShipmentWeightCalculator());
            ReceiptPrinter printer=new ReceiptPrinter();
            ICheckOutService checkoutService = new CheckOutService(shipmentService,printer);
            checkoutService.checkOut(customer, cart);

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        System.out.println();

        System.out.println("===================================================================");

    }


    public static void testCase4() {
        System.out.println("===== Test Case 4 : Expired Product =====");

        try {
            Product yogurt = new ExpiringProduct("Yogurt", 5.0, 20, true); // Expired


            System.out.println("---------------------------------------------------");


            Customer customer = new Customer("Omar", 500.0);

            Cart cart = new Cart();
            cart.add(yogurt, 1);

            System.out.println("---------------------------------------------------");


            IShipmentService shipmentService = new ShipmentService(new ShipmentWeightCalculator());
            ReceiptPrinter printer=new ReceiptPrinter();
            ICheckOutService checkoutService = new CheckOutService(shipmentService,printer);
            checkoutService.checkOut(customer, cart);

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        System.out.println();

        System.out.println("===================================================================");

    }



    public static void testCase5() {
        System.out.println("===== Test Case : Out of Stock Product =====");

        try {
            Product laptop = new ShippedProduct("Laptop", 1000.0, 0, 2.0, WeightUnit.KILOGRAM); // 0 stock



            System.out.println("---------------------------------------------------");

            Customer customer = new Customer("Omar", 2000.0);
            Cart cart = new Cart();
            cart.add(laptop, 1); // stock = 0 → show warning

            System.out.println("---------------------------------------------------");


            IShipmentService shipmentService = new ShipmentService(new ShipmentWeightCalculator());
            ReceiptPrinter printer=new ReceiptPrinter();
            ICheckOutService checkoutService = new CheckOutService(shipmentService,printer);
            checkoutService.checkOut(customer, cart);

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("===================================================================");
    }


     public static void testCase6() {

        System.out.println("===== Test Case 6: No errors =====");

        try {

            Product cheese = new ShippedExpiringProduct("Cheese", 100.0, 5, 400, WeightUnit.GRAM, false);
            Product yogurt = new ShippedExpiringProduct("Yogurt", 50.0, 6, 300, WeightUnit.GRAM, false);


            Product tv = new ShippedProduct("TV", 200.0, 2, 2.5, WeightUnit.KILOGRAM);
            Product fan = new ShippedProduct("Fan", 120.0, 3, 1.2, WeightUnit.KILOGRAM);

            // Regular Products (no shipping, no expiration)
            Product scratchCard = new Product("Scratch Card", 50.0, 10);
            Product ebook = new Product("E-Book", 80.0, 4);

            System.out.println("---------------------------------------------------");

            Customer customer = new Customer("Omar", 2000.0);

            Cart cart = new Cart();
            cart.add(cheese, 2);
            cart.add(yogurt, 2);
            cart.add(tv, 1);
            cart.add(fan, 1);
            cart.add(scratchCard, 2);
            cart.add(ebook, 1);

            System.out.println("---------------------------------------------------");

            IShipmentService shipmentService = new ShipmentService(new ShipmentWeightCalculator());
            ReceiptPrinter printer = new ReceiptPrinter();
            ICheckOutService checkoutService = new CheckOutService(shipmentService, printer);
            checkoutService.checkOut(customer, cart);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();
        System.out.println("===================================================================");
    }


    public static void main(String[] args) {


        testCase1();

        testCase2();


        testCase3();


        testCase4();

        testCase5();


    }
}
