package javaprograms.datastructuresandalgorithms;

public class SingleLinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    public SingleLinkedList() {
        head = null;
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data, null);
        }
    }

    //finding middle element in traditional way
    public int findMiddleElementTraditionalWay() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        int middleNode = count / 2;
        temp = head;
        while (temp != null && middleNode > 0) {
            temp = temp.next;
            middleNode--;
        }
        return temp.data;
    }

    //find middle element in single pass
    public int findMiddleEleInSinglePass() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.data;
    }

    //detect loop
    public boolean detectLoop() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;

    }

    //find nth element from end of list
    public int nthElementFromEndOfList(int n) {
        Node slowPointer = head;
        Node fastPointer = head;
        while (n > 0 && fastPointer != null) {
            fastPointer = fastPointer.next;
            n--;
        }
        while (fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer.data;

    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(60);
        list.insert(50);
        System.out.println("Middle element: " + list.findMiddleElementTraditionalWay());
        System.out.println("Middle element in single pass: " + list.findMiddleEleInSinglePass());
        System.out.println("is loop detected: " + list.detectLoop());
        System.out.println("nth element from end of list: " + list.nthElementFromEndOfList(2));
    }


}
