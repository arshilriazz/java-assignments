package assignments.assignment7.Part4;

class BiFactory implements ICycleFactory {

    public ICycle getType() {
        return new Bicycle();
    }
}
