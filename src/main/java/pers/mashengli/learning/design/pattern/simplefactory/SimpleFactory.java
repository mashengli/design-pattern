package pers.mashengli.learning.design.pattern.simplefactory;

/**
 * @author mashengli
 */
public class SimpleFactory {
    public static Operation createOperation(String type) {
        if ("+".equals(type)) {
            return new AddOperation();
        }
        if ("-".equals(type)) {
            return new SubOperation();
        }
        if ("*".equals(type)) {
            return new MulOperation();
        }
        if ("/".equals(type)) {
            return new DivOperation();
        }
        throw new IllegalArgumentException("不支持的运算");
    }
}
