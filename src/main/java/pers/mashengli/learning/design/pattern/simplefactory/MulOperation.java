package pers.mashengli.learning.design.pattern.simplefactory;

/**
 * @author mashengli
 */
class MulOperation extends Operation {
    double getResult() {
        return getNumberA() * getNumberB();
    }
}
