package assignments.assignment6;

public class ObjectReference {
    public ObjectReference(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        ObjectReference[] objectReferences = new ObjectReference[10];
        for(int i = 0; i < objectReferences.length; i++) {
            System.out.println(objectReferences[i]);
            //because not initialized they are all null
        }
    }
}
