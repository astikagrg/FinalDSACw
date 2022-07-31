package Week1;
public class SinglyLinkedList {
    static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size=0;

    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.Next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public int getDataAtAnyPos(int pos){
        Node current = head;
        for(int i=1;i<=pos;i++){

            current=current.Next;
        }
        return current.data;
    }

    public void AppendNode(int data) {
        // Node newNode = new Node(data);
        // if (head == null) {
        // head = newNode;
        // } else {
        // Node current = head;
        // while (current.Next != null) {
        // current = current.Next;
        // }
        // current.Next = newNode;
        // }

        // Constant time
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public void PrintList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.Next;
        }
    }

    public void AddHeadFirst(int data) {
        Node newNode = new Node(data);
        newNode.Next = head;
        head = newNode;
    }

    public void RemoveNode(Node node) {
        if (head != null) {
            Node current = head;
            while (current.Next != node) {
                current = current.Next;
            }
            current.Next = node.Next;
        }
    }

    public void RemoveNodeAtAnyPos(int pos) {
        if (head != null) {
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.Next;

            }
            current.Next = current.Next.Next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList LL = new SinglyLinkedList();
        LL.AppendNode(500);
        LL.AppendNode(600);
        LL.AppendNode(700);
        LL.AppendNode(800);
        LL.AddHeadFirst(900);
        LL.AddHeadFirst(200);
        LL.RemoveNodeAtAnyPos(3);
        LL.PrintList();

    }
}