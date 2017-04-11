package pers.mashengli.learning.design.pattern.simplefactory;

/**
 * @author mashengli
 */
public class DivOperation extends Operation {
    public double getResult() throws IllegalArgumentException {
        if (getNumberB() != 0) {
            return getNumberA() / getNumberB();
        }
        throw new IllegalArgumentException("除数不能为零");
    }
}
