class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    static Node insertFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;

    }
    static Node deleteK(Node head, int k) {
        // Check if the list is empty
        if (head == null)
            return head;

        // If k is 1, delete the first node
        if (k == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }

        // Traverse the list to find the k-th node
        Node temp = head;
        Node prev = null;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            // If the k-th node is found
            if (cnt == k) {
                // Adjust the pointers to skip the k-th node
                prev.next = prev.next.next;
                // Delete the k-th node
                temp = null;
                break;
            }
            // Move to the next node
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    public static void printLL(Node head){
        Node currNode = head;
        while(currNode.next!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Create a linked list
        int[] arr = {0, 1, 2,5,4};
        int k = 2;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head = insertFirst(head,8);
        // Delete the k-th node in the linked list
        head = deleteK(head,k);

        // Print the modified linked list
        printLL(head);
    }
}