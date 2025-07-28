import java.util.Date;

public class Per30MinStrategy implements PricingStrategy{
    private static final long price = 75;
    @Override
    public long calculateCost(long minutes) {
        long cost = (long)Math.ceil((double)minutes/(double)30)*price;
        return cost;
    }
}
