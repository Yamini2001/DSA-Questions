class LL{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public Node deleteMiddle(){
        if(head==null || head.next==null){
            return head;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev!=null){
            prev.next = slow.next;
        }
        else{
            head = slow.next;
        }
        return slow;
    }
    public void printList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(8);
        list.addFirst(9);
        list.addFirst(4);
        Node middle = list.deleteMiddle();
        System.out.println("Delete the element of middle of the list list: "+middle.data);
        list.printList();
    }
}
