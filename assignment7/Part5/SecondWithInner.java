package assignments.assignment7.Part5;

public class SecondWithInner {
    public SecondWithInner() {
        System.out.println("Second outer class");
    }

    public static class SecondInnerClass extends FirstWithInner.FirstInnerClass {
        public SecondInnerClass(String string) {
            super(string);
            System.out.println(string + 2);
        }
    }
}
