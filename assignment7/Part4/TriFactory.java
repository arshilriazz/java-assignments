package assignments.assignment7.Part4;

class TriFactory implements ICycleFactory {

    public ICycle getType() {
        return new Tricycle();
    }
}
