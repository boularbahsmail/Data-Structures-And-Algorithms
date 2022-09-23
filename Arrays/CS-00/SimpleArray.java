public class SimpleArray {
  public static void main(String[] args) {
    // Init an array
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 7;
    numbers[2] = 4;
    numbers[3] = 6;
    numbers[4] = 2;

    System.out.println("Simple array");
    // Looping through the array
    for (int i = 0; i < numbers.length; i++) {
      // \t : Space Between Elements
      System.out.print(numbers[i] + "\t");
    }

    // Two dimensional array
    int [][] data = new int[3][3];
    data[0][0] = 14;
    data[0][1] = 45;
    data[0][2] = 72;
    data[1][0] = 54;
    data[1][1] = 22;
    data[1][2] = 96;
    data[2][0] = 34;
    data[2][1] = 52;
    data[2][2] = 81;

    System.out.println("\nTwo dimensional array");
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length; j++) {
        System.out.print(data[i][j] + "\t");
      }
      System.out.println("\n");
    }
  }
}
