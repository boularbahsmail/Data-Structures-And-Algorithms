public class DynamicStackArray<T> {

    int Size;
    Object[] ArrayStack;
    int top;

    public DynamicStackArray(int Size) {
        this.Size = Size;
        ArrayStack = new Object[Size];
        top = -1;
    }

    public void push(Object newItem) {
        ensureCapacity(top + 2);
        // Stack will never be full because we're using a dynamic stack array
        /* if (isFull) {
            System.out.pritln("Stack is full");
            return null;
        }; */

        top = top + 1;
        ArrayStack[top] = newItem;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = ArrayStack.length;

        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;

            if (newCapacity < minCapacity) { // Delete item
                newCapacity = minCapacity;
            }

            // Arrays.copyOf(originalLength, newLength);
            ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);
        }
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