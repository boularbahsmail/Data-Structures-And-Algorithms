public class LinkedList {
    // First item
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void addNode(Node newNode) { // O(1)
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode() { // O(1)
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