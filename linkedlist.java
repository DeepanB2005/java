class Node
{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        Node head = new Node(a[0]);
        Node current = head;
        for (int i = 1; i < a.length; i++) {
            current.next = new Node(a[i]);
            current = current.next;
        }
        current = head;
        while (current != null) {System.out.print(current.data + " ");
            current = current.next;
        }
        
    }
}