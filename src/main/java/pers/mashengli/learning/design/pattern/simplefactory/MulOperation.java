package pers.mashengli.learning.design.pattern.simplefactory;

/**
 * @author mashengli
 */
class MulOperation extends Operation {
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
