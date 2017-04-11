package pers.mashengli.learning.design.pattern.strategy;

/**
 * @author mashengli
 */
public class StrategyCut extends Strategy {
    private static double rate = 0.8;

    double getResult(double totalPrice) {
        return totalPrice * rate;
    }
}
