package implementations;
import interfaces.SomeInterface;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see implementations.SomeImplementation
 * @see interfaces.SomeInterface
 */

public class SomeOtherImplementation implements SomeInterface {

    @Override
    public void doSomething() {
        System.out.println("Doing something 2");
    }

    @Override
    public void doOther() {
        System.out.println("Doing other 2");
    }
}
