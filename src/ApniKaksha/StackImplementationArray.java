package ApniKaksha;

import java.util.Scanner;

/* First of all, stack has 3 main functions, these are: push() and pop().
 Stack follows LIFO approach and is a linear data structure.

1. push() method is used to add element to the top of the stack.
2. pop() method is used to delete element at the top of stack.
3. top() method returns the top-most element of the stack.
4. empty() method checks if the stack is empty or not.

*/
public class StackImplementationArray {
    static int i = 0;
    Scanner sc = new Scanner(System.in);
    int size = 100;
    int[] arr = new int[size];

    public static void main(String[] args) {
        StackImplementationArray stack2array = new StackImplementationArray();

        while (true) {

            System.out.println("Choose among the following operations: ");
            System.out.println("1. Push to stack: ");
            System.out.println("2. Pop from stack: ");
            System.out.println("3. Return Top of Stack: ");
            System.out.println("4. Check if stack is empty: ");
            System.out.println("5. Print all elements of the stack: ");
            System.out.println("Press 0 to exit.");

            System.out.println();
            System.out.print("Enter choice: ");

            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();

            switch (select) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                case 1:
                    stack2array.Push();
                    break;
                case 2:
                    stack2array.Pop();
                    break;
                case 3:
                    stack2array.Top();
                    break;
                case 4:
                    stack2array.Empty();
                    break;
                case 5:
                    stack2array.PrintElements();
                    break;
                default:
                    System.out.println("Wrong input detected!!");
            }
        }
    }

    void array(int element) {
        arr[i] = element;
        i++;
        System.out.println("Element " + element + " added to stack.");
    }

    void Push() {
        System.out.print("Enter the element: ");
        int element = sc.nextInt();
        array(element);
    }

    void Pop() {
        System.out.println("Element " + arr[--i] + " removed from stack.");
        arr[i] = 0;
        i--;
    }

    void Top() {
        System.out.println("Element " + arr[--i] + " is at the top of the stack.");
    }

    void Empty() {
        if (i == 0) System.out.println("Stack is empty.");
        else System.out.println("Stack has elements.");
    }

    void PrintElements() {
        for (int temp = i - 1; temp >= 0; temp--) {
            System.out.println(arr[temp]);
        }
    }
}
