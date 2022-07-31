
// import weekEighty.KeyLock.QueueExample.Node;

// public class KeyLock {

//     public static class QueueExample {
//         public static class Node {
//             int x;
//             int y;
//             int step;

//             Node(int x, int y) {
//                 this.x = x;
//                 this.y = y;

//             }
//         }

//         Node queues[];
//         int front = -1;
//         int rear = -1;
//         int size;

//         QueueExample(int size) {
//             this.size = size;
//             queues = new Node[size];
//         }

//         public boolean enqueue(Node node) {
//             if (isFull()) {
//                 System.out.println("queue overflow");
//                 return false;
//             }
//             if (front == -1) {
//                 front = 0;
//             }
//             queues[++rear] = node;
//             return true;
//         }

//         public boolean isFull() {
//             return rear == size - 1;
//         }

//         public Node dequeue() {
//             if (isEmpty()) {
//                 System.out.println("queue empty");
//                 return new Node(-1, -1);
//             }
//             int val = front;
//             if (front == rear) {
//                 front = rear = -1;
//             } else {
//                 front++;
//             }
//             return queues[val];
//         }

//         public boolean isEmpty() {
//             return front == -1;
//         }
//     }

//     int mapx;
//     int mapy;
//     String[][] map;
//     int[] movex = { 1, -1, 0, 0 };
//     int[] movey = { 0, 0, 1, -1 };

//     KeyLock(String[] map, int mapx, int mapy) {

//     }

//     int pathfinder() {
//         String locks = "ABCD";
//         String keys = "abcd";
//         int keys_found = 0;
//         Node rootnode = new Node(0, 0);
//         boolean visited[][] = new boolean[mapx][mapy];
//         rootnode.step = 0;
//         QueueExample travel = new QueueExample(mapx * mapy);
//         travel.enqueue(rootnode);
//         char[] keyfound = new char[4];
//         int key_index = 0;

//         while (!travel.isEmpty()) {

//         }
//         System.out.println("Couldn't complete mission");
//         return -1;

//     }

//     public static void main(String[] args) {
//         String[] map = { "@*a*#", "###*#", "b*A*B" };
//         KeyLock obj = new KeyLock(map, 3, 5);
//         System.out.println(obj.pathfinder());
//     }
// }
