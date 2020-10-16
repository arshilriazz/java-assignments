package assignments.assignment10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> itr =list.iterator();

        itr.insert(1);
        itr.insert(2);
        itr.insert(3);
        itr.insert(4);
        itr.insert(5);
        itr.insert(6);
        itr.remove(6 );
        System.out.println(list);
    }
}
