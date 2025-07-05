import java.util.List;

public class ShipmentService implements IShipmentService {

    private ShipmentWeightCalculator calculator;


    public ShipmentService(ShipmentWeightCalculator calculator){

        this.calculator=calculator;

    }

    public void ProcessShipment(List<CartItem> items){


        System.out.println("** Shipment notice **");

        double totalWeight=calculator.calculate(items);


        System.out.println("Total package weight : "+totalWeight+" kg");

    }



}
