public class Demo {
    public static void main(String[] args) {
        
        LinkedList ls = new LinkedList(new Node<Integer>(12, null));

        ls.addNode(new Node<Integer>(14, null));
        ls.addNode(new Node<Integer>(47, null));
        ls.Display();

        System.out.println("After delete");

        ls.deleteNode();
        ls.Display();
    }
}

/* Generics : <T> : Accepts any data type */
