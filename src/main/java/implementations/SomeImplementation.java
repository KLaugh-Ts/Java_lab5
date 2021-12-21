package implementations;
import interfaces.SomeInterface;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see implementations.SomeOtherImplementation
 * @see interfaces.SomeInterface
 */

public class SomeImplementation implements SomeInterface {

    @Override
    public void doSomething() {
        System.out.println("Doing something 1");
    }

    @Override
    public void doOther() {
        System.out.println("Doing other 1");
    }
}
