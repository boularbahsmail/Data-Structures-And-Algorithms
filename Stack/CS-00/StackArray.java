public class StackArray<T> {

    int Size;
    Object[] ArrayStack;
    int top;

    public StackArray(int Size) {
        this.Size = Size;
        ArrayStack = new Object[Size];
        top = -1;
    }

    public void push(Object newItem) {
        if (isFull) {
            System.out.pritln("Stack is full");
            return null;
        };

        top = top + 1;
        ArrayStack[top] = newItem;
    }

    public boolean isFull() {
        return (top == Size - 1);
    }

    public boolean isEmpty() {
        return (top == - 1);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.pritln("Stack is empty");
            return null;
        };

        T item = (T) ArrayStack[top];
        top = top - 1;
        return item;
    }
}