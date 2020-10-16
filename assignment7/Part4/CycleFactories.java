package assignments.assignment7.Part4;

public class CycleFactories {
    public static void rideCycle(ICycleFactory factory) {
        ICycle cycle = factory.getType();
        cycle.wheels();
    }

    public static void main(String[] args) {
        rideCycle(new UniFactory());
        rideCycle(new BiFactory());
        rideCycle(new TriFactory());
    }
}
