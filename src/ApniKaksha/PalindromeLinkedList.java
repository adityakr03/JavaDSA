package ApniKaksha;

public class PalindromeLinkedList extends linkedListImplementation {
    public static void main(String[] args) {
        PalindromeLinkedList list_l1 = new PalindromeLinkedList();

        list_l1.AddAtBeginning("Hello");
        list_l1.AddAtBeginning("Bye");
        list_l1.AddAtBeginning("Bye");
        list_l1.AddAtBeginning("Hello");

        System.out.print("Given list: ");
        list_l1.Print();

        System.out.println("Is Palindrome: " + list_l1.palindrome(list_l1.head));
    }

    boolean palindrome(Node head) {

        if (head == null) return true;

        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node cur = head;

        while (last != null) {
            if (last.data != cur.data) return false;
            last = last.next;
            cur = cur.next;
        }
        return true;
    }

    // How to reverse a linked list:
    Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
