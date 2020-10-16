package assignments.assignment10;

public class SList<E> {
    SListIterator<E> sListIterator;
    public String toString() {
        ListNode<E> curr = sListIterator.getHead();
        StringBuilder s = new StringBuilder();
        while(curr != null) {
            s.append(curr.val);
            s.append(" ");
            curr = curr.next;
        }
        return s.toString();
    }

    public SListIterator<E> iterator() {
        sListIterator = new SListIterator<E>();
        return sListIterator;
    }

}
