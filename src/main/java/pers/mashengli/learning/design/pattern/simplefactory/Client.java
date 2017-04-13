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

        Operation opt3 = SimpleFactory.createOperation(MulOperation.class);
        opt3.setNumberA(0.1);
        opt3.setNumberB(0.2);
        System.out.println("*=" + opt3.getResult());

        Operation opt4 = SimpleFactory.createOperation(SubOperation.class);
        opt4.setNumberA(0.1);
        opt4.setNumberB(0.2);
        System.out.println("-=" + opt4.getResult());

        Operation opt2 = SimpleFactory.createOperation("/");
        opt2.setNumberA(0.1);
        opt2.setNumberB(0);
        System.out.println("/=" + opt2.getResult());
    }
}
