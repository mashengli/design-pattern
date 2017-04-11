package pers.mashengli.learning.design.pattern.strategy;

/**
 * @author mashengli
 */
public class Client {
    public static void main(String[] args) {
        PriceContext context1 = new PriceContext(1);
        double count1 = context1.getResult(1 * 100);
        System.out.println("terma, num = 1, singlePrice = 100, count=" + count1);
        PriceContext context2 = new PriceContext(2);
        double count2 = context2.getResult(2 * 2.4);
        System.out.println("termb, num = 2, singlePrice = 2.4, count=" + count2);

        PriceContext context3 = new PriceContext(3);
        double count3 = context3.getResult(3 * 3);
        System.out.println("termc, num = 3, singlePrice = 3, count=" + count3);

        double total = count1 + count2 + count3;
        System.out.println("total=" + total);

    }
}
