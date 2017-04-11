package pers.mashengli.learning.design.pattern.strategy;

/**
 * @author mashengli
 */
public class PriceContext {
    private Strategy strategy;

    public PriceContext(int type) {
        switch (type) {
            case 1:
                strategy = new StrategyCut();
                break;
            case 2:
                strategy = new StrategyDeduct();
                break;
            case 3:
                strategy = new StrategyNormal();
                break;
            default:
                strategy = new StrategyNormal();
                break;
        }
    }

    public double getResult(double totalPrice) {
        return strategy.getResult(totalPrice);
    }
}
