package assignments.assignment7.Part3;

public class Main {
    public static void main(String[] args) {
        IFirst ourClass1 = new OurClass();
        ISecond ourClass2 = new OurClass();
        IThird ourClass3 = new OurClass();
        IInherit ourClassInherit = new OurClass();
        OurClass ourClass = new OurClass();
        ourClass.interface1Method(ourClass1);
        ourClass.interface2Method(ourClass2);
        ourClass.interface3Method(ourClass3);
        ourClass.allInterfacesMethod(ourClassInherit);
    }
}
