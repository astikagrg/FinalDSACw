package Week1;

import Week1.SinglyLinkedList.Node;

public class Que1 {

    SinglyLinkedList[] arr; // array to store all the linked lists user inputs.

    Que1(SinglyLinkedList[] arr) {
        // constructor
        this.arr = arr;
    }

    SinglyLinkedList MergeAll() {
    //    a function to iterate through the linked lists and merge them


        SinglyLinkedList FinalOutputList = arr[0]; // Initialize the final output list with the first linked list.
        SinglyLinkedList mergedList; // LinkedList that is used to store the merged linked lists.
        for (int i = 1; i < arr.length; i++) {
            // iterating through the given first two linked lists
            mergedList = MergeTwo(FinalOutputList, arr[i]); // Merge the current linked list with the final output list.
            FinalOutputList = mergedList; // Update the final output list with the merged linked list.
        }
        return FinalOutputList; // Return the final output list.
    }

    SinglyLinkedList MergeTwo(SinglyLinkedList a, SinglyLinkedList b) {
        // This function merges two linked lists.
        SinglyLinkedList result = new SinglyLinkedList(); // Initialize the result linked list.
        Node first_itterator = a.head; // Initialize the first itterator with the first linked list.
        Node second_itterator = b.head; // Initialize the second itterator with the second linked list.
        while (first_itterator != null) {
            // itterate through the first linked list.
            result.addNode(first_itterator.data); // Append the current data to the result linked list.
            first_itterator = first_itterator.Next; // Update the first itterator.
        }
        while (second_itterator != null) {
            // itterate through the second linked list.
            result.addNode(second_itterator.data); // Append the current data to the result linked list.
            second_itterator = second_itterator.Next; // Update the second itterator.
        }
        return sortLinkedList(result); // Return the sorted result linked list.
    }

    SinglyLinkedList sortLinkedList(SinglyLinkedList list) {
        // Node current will point to head
        Node current = list.head, index = null; // Initialize the current and index pointers.
        int temp; // Initialize the temp variable.

        if (list.head == null) {
            return null; // If the linked list is empty, return null.
        } else {
            while (current != null) {
                // Node index will point to node next to current
                index = current.Next;

                while (index != null) {
                    // If current node's data is greater than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.Next;
                }
                current = current.Next;
            }
        }
        return list; // Return the sorted linked list.
    }

    void Median() {
        int median = MergeAll().getSize() / 2; // Get the median of the linked list.
        System.out.println("Median: " + MergeAll().getDataAtAnyPos(median)); // Print the median.
    }

    public static void main(String[] args) {
        SinglyLinkedList[] arr = new SinglyLinkedList[3];
        SinglyLinkedList L1 = new SinglyLinkedList();
        SinglyLinkedList L2 = new SinglyLinkedList();
        SinglyLinkedList L3 = new SinglyLinkedList();
        L1.addNode(2);
        L1.addNode(4);
        L1.addNode(7);
        L1.addNode(5);
        L1.addNode(10);
        L2.addNode(3);
        L2.addNode(2);
        L2.addNode(7);
        L2.addNode(9);
        L3.addNode(12);
        L3.addNode(5);
        L3.addNode(6);
        L3.addNode(9);
        arr[0] = L1;
        arr[1] = L2;
        arr[2] = L3;
        Que1 w = new Que1(arr);
        w.Median();
        
    }
}