package ApniKaksha;

public class linkedListImplementation {
    Node head;

    public static void main(String[] args) {

        linkedListImplementation list = new linkedListImplementation();
        // Since LoopInLinkedList uses stack, so 1st in last out.
        list.AddAtBeginning("World");
        list.AddAtBeginning("Hello");
        list.Print();
        list.AddAtLast("Bye!!");
        list.Print();
        list.Reverse();
        list.Print();
        list.head = list.RevRec(list.head);
        list.Print();
        list.DeleteAtBeginning();
        list.Print();
        list.DeleteAtLast();
        list.Print();
    }

    // Entering element at Start:
    public void AddAtBeginning(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Entering element at Last:
    public void AddAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        // Traversing to reach the end of the linked list:
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Here we have reached the last node, so:
        currNode.next = newNode;
        newNode.next = null;
    }

    // Printing the linked list elements:
    public void Print() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        // Traversing to reach the end of the linked list:
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        // Here we have reached the last node, so:
        System.out.println("null");
    }

    // Deleting element at Start:
    public void DeleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }

        head = head.next;
    }

    // Delete element at last:
    public void DeleteAtLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        // Traversing till 2nd last node and deleting the last node:
        Node secondLast = head;
        Node Last = head.next;
        while (Last.next != null) {
            Last = Last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // Reverse a linked list using iterative approach:
    public void Reverse() {
        if (head == null || head.next == null) {
            System.out.println("List is empty!");
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse a linked list using recursive approach:
    public Node RevRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = RevRec(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}