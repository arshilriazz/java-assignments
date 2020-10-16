package assignments.assignment7.Part4;

class UniFactory implements ICycleFactory {

    public ICycle getType() {
        return new Unicycle();
    }
}
