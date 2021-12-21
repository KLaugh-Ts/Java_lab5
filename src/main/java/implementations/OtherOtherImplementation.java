package implementations;
import interfaces.OtherInterface;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see implementations.OtherImplementation
 * @see interfaces.OtherInterface
 */

public class OtherOtherImplementation implements OtherInterface {

    @Override
    public void doSomething() {
        System.out.println("Doing something 4");
    }

    @Override
    public void doOther() {
        System.out.println("Doing other 4");
    }
}