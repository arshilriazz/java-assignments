package assignments.assignment6;

public class ObjectReferenceInitialized {
    public ObjectReferenceInitialized(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        ObjectReferenceInitialized[] objectReferences = new ObjectReferenceInitialized[10];
        for(int i = 0; i < objectReferences.length; i++) {
            objectReferences[i] = new ObjectReferenceInitialized("hello");
//            System.out.println(objectReferences[i]);
        }
    }

}
