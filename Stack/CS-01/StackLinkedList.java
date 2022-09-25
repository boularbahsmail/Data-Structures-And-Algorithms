public class StackLinkedList {

    // First item
    Node head;

    public StackLinkedList(Node head) {
        this.head = head;
    }

    public void push(Node newNode) { // O(1)
        newNode.next = head;
        head = newNode;
    }

    public void pop() { // O(1)
        // Delete first item
        head = head.next;
    }

    public void Display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }
}