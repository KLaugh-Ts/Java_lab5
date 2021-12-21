package implementations;
import interfaces.OtherInterface;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see implementations.OtherOtherImplementation
 * @see interfaces.OtherInterface
 */

public class OtherImplementation implements OtherInterface {

    @Override
    public void doSomething() {
        System.out.println("Doing something 3");
    }

    @Override
    public void doOther() {
        System.out.println("Doing other 3");
    }
}
