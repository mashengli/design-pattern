package pers.mashengli.learning.design.pattern.simplefactory;

/**
 * @author mashengli
 */
public class SubOperation extends Operation {
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
