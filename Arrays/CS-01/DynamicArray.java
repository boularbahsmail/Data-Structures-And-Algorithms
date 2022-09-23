/*
    -- Dynamic array : Editable size
    • Set size to 2
    • => |42|12|
    • Add new item (65)
    • We double the size of the array & We add the new item
    • => |42|12|65| |
*/

public class DynamicArray {
    int[] data;
    int size;

    public DynamicArray() {
        // Init Array
        size = 0;
        data = new int[1];
    }

    public int getSize() {
        return data.length;
    }

    public int getElement(int index) {
        return data[index];
    }

    public void setElement(int element) {
        // Check if the size of the array enough to add new element
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;

        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;

            if (newCapacity < minCapacity) { // Delete item
                newCapacity = minCapacity;
            }

            // Arrays.copyOf(originalLength, newLength);
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
