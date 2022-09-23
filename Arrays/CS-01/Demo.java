public class Demo {
    public static void main(String[] args) {
        DynamicArray dynamic_array = new DynamicArray();
        // Add new element
        dynamic_array.put(47);
        // Show array size
        System.out.println("Size : " + dynamic_array.getSize());

        dynamic_array.put(12);
        System.out.println("Size : " + dynamic_array.getSize());
        
        dynamic_array.put(65);
        System.out.println("Size : " + dynamic_array.getSize());
    }
}