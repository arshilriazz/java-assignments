package assignments.assignment10;

public class SListIterator<E> {
    private ListNode<E> head;
    int size = 0;

    public SListIterator() {
        this.head = null;
    }

    public ListNode<E> getHead() {
        return this.head;
    }

    public void insert(E val) {
        if(head == null) {
            head = new ListNode<>(val);
            size++;
            return;
        }
        ListNode<E> curr = head;
        while(curr.next != null) curr = curr.next;
        curr.next = new ListNode<>(val);
        this.size++;
    }

    public void remove(int position) {
        ListNode<E> curr = head;
        if(position > size) {
            System.out.println("position exceeded");
            return;
        }
        if(position == 1) {
            head = curr.next;
            size--;
            return;
        }
        for (int i = 1 ; i < position - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    public void show() {
        ListNode<E> curr = head;
        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
