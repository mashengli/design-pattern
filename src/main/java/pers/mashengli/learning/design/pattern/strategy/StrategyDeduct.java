package pers.mashengli.learning.design.pattern.strategy;

/**
 * @author mashengli
 */
public class StrategyDeduct extends Strategy {

    double getResult(double totalPrice) {
        long hundreds = new Double(totalPrice).longValue() / 100;
        return totalPrice - hundreds * 20;
    }
}
