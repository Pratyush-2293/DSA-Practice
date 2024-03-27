public class LinkedList {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // creating the new node & assigning head if there are no nodes in the ll.
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }

        // updating next in the ll.
        newNode.next = head;

        // updating head in the ll.
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
}