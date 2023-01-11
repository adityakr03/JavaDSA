package Collections;

public class LoopInLinkedList {

    // To detect a loop in  a linked list, we use a fast and a slow pointer, the fast pointer moves 2 steps at once, and the slow pointer moves 1 step at once.

    // If at any point, the fast pointer points to null, then we can say that there is no loop in the linked list.

    // If there is a loop present, during the iteration, there will be a point where the slow and fast pointer will point to the same linked list.

    // Now, create a temp which points to the intersection point of fast and slow pointer, and traverse it ahead, also, create another temp which points at the starting/head of the linked list and move it forward, the point at which these temps will meet is guaranteed to be the point where there is a loop.

    // Code Solution:

    // Java program to detect and remove loop in linked list

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function that detects loop in the list
    int detectAndRemoveLoop(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null
                && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop
            // is present
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }

    // Function to remove loop
    void removeLoop(Node loop, Node head) {
        Node ptr1 = loop;
        Node ptr2 = loop;

        // Count the number of nodes in loop
        int k = 1, i;
        Node prevNode = ptr1;
        while (ptr1.next != ptr2) {
            // keeping track beforeing moving next
            prevNode = ptr1;
            ptr1 = ptr1.next;
            k++;
        }
        prevNode.next = null;
    }

    // Function to print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        LoopInLinkedList list = new LoopInLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println(
                "Linked List after removing loop : ");
        list.printList(head);
    }
}
