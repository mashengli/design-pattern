package pers.mashengli.learning.design.pattern.decorator;

/**
 * @author mashengli
 */
abstract class Decorator extends Dress {

    private Dress dress;

    public Decorator(Dress dress) {
        this.dress = dress;
    }

    public void wear() {
        if (dress != null) {
            dress.wear();
        }
    }

}
