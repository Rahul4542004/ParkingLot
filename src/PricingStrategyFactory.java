public class PricingStrategyFactory {
    public static PricingStrategy getStrategy(long minutes){
        if(minutes <= 120){
            return new Per15MinStrategy();
        }
        else
            return new Per30MinStrategy();
    }
}
