package pers.mashengli.learning.design.pattern.simplefactory;

/**
 * @author mashengli
 */
public class Client {
    public static void main(String[] args) {
        Operation opt = SimpleFactory.createOperation("+");
        opt.setNumberA(0.1);
        opt.setNumberB(1);
        System.out.println("+=" + opt.getResult());

        Operation opt2 = SimpleFactory.createOperation("/");
        opt.setNumberA(0.1);
        opt.setNumberB(0);
        System.out.println("/=" + opt2.getResult());
    }
}
