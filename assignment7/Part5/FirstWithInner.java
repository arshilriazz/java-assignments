package assignments.assignment7.Part5;

public class FirstWithInner {
    public FirstWithInner() {
        System.out.println("First outer class");
    }

    public static class FirstInnerClass {
        public FirstInnerClass(String string) {
            System.out.println(string + 1);
        }
    }
}
