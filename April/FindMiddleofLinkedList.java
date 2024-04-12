class LL {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node addMiddle() {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(9);
        Node middle = list.addMiddle();
        System.out.println("Middle of the linked list: " + middle.data);
        list.printList();
    }
}
