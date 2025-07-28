import java.util.Date;
public class Per15MinStrategy implements PricingStrategy{
    private static final int price = 50;
    public long calculateCost(long minutes){
        long cost = (long)Math.ceil((double)minutes/(double)15)*price;
        return cost;
    }
}
