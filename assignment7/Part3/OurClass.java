package assignments.assignment7.Part3;

public class OurClass extends ConcreteClass implements IInherit{
    @Override
    public void firstMethodChild() {
        System.out.println("first method in Inherited");
    }

    @Override
    public void firstMethod1() {
        System.out.println("first method in 1 Interface");
    }

    @Override
    public void secondMethod1() {
        System.out.println("second method in 1 Interface");

    }

    @Override
    public void firstMethod2() {
        System.out.println("first method in 2 Interface");

    }

    @Override
    public void secondMethod2() {
        System.out.println("second method in 2 Interface");

    }

    @Override
    public void firstMethod3() {
        System.out.println("first method in 3 Interface");

    }

    @Override
    public void secondMethod3() {
        System.out.println("second method in 3 Interface");

    }

    public void interface1Method(IFirst ourClass) {
        ourClass.firstMethod1();
        ourClass.secondMethod1();
    }
    public void interface2Method(ISecond ourClass) {
        ourClass.firstMethod2();
        ourClass.secondMethod2();
    }
    public void interface3Method(IThird ourClass) {
        ourClass.firstMethod3();
        ourClass.secondMethod3();
    }
    public void allInterfacesMethod(IInherit ourClass) {
        ourClass.firstMethod1();
        ourClass.secondMethod1();
        ourClass.firstMethod2();
        ourClass.secondMethod2();
        ourClass.firstMethod3();
        ourClass.secondMethod3();
        ourClass.firstMethodChild();
    }
}
