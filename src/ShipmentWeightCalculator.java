import java.util.List;

public class ShipmentWeightCalculator {


    public  double calculate(List<CartItem> items) {


        double totalWeight=0;

        for(CartItem item:items){

            Shippable shippableItem=(Shippable) item.getProduct();


            System.out.println(shippableItem+" , weight : "+shippableItem.getWeight()+" "+shippableItem.getWeightUnit().getSymbol());



            WeightUnit weightUnit=shippableItem.getWeightUnit();
            double itemWeight=((Shippable) item.getProduct()).getWeight();

            if(weightUnit==WeightUnit.GRAM)
                totalWeight=totalWeight+(itemWeight/1000.0);

            else
                totalWeight += itemWeight;


        }
            return totalWeight;
    }
}
