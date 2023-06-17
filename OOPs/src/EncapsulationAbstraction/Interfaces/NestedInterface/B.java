package EncapsulationAbstraction.Interfaces.NestedInterface;

public class B implements A.NestedInterface {
    // The nested interface can be declared as public, private or protected.
    // But the top level interface has to be declared as public or the default one.
        @Override
        public boolean isOdd(int num) {
            return (num & 1) == 1;
        }
}
