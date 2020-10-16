package assignments.assignment6;

public class OverLoaded {
    String first = "first";
    public OverLoaded() {
        System.out.println("This is second");
    }
    public OverLoaded(String string) {
        if(string.equals(first)) {
            new OverLoaded();
        }
        System.out.println("This is first");
    }

    public static void main(String[] args) {
        OverLoaded overLoaded = new OverLoaded("first");
    }
}
