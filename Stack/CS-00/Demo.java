public class Demo {
    public static void main(String[] args) {

        System.out.println("Simple Stack Array");

        StackArray<Integer> stack = new StackArray<Integer>(5);
        stack.push(11);
        stack.push(45);
        stack.push(35);
        System.out.println("Top:" + stack.top); // Top: 2
        System.out.println(stack.pop()); // Last entered item will be deleted : 35
        System.out.println("Top:" + stack.top); // Top: 1

        // Dynamic Stack Array Demo
        System.out.println("Dynamic Stack Array");

        DynamicStackArray<Integer> stack_dynamic = new DynamicStackArray<Integer>(3);
        stack_dynamic.push(68);
        stack_dynamic.push(72);
        stack_dynamic.push(93);
        System.out.println("Top:" + stack_dynamic.top); // Top: 2
        System.out.println("Size:" + stack_dynamic.DynamicStackArray.length); // Size: 3
        stack_dynamic.push(17);
        System.out.println("Size:" + stack_dynamic.DynamicStackArray.length); // Size: 6
        System.out.println(stack_dynamic.pop()); // Last entered item will be deleted : 17
        System.out.println("Top:" + stack_dynamic.top); // Top: 2
    }
}