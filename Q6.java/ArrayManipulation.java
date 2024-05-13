public class ArrayManipulation {

  public static void main(String[] args) {
      int[] array = {3, 7, 1, 9, 4};
      int indexToDelete = 2;

      System.out.println("Original Array: ");
      printArray(array);

      int[] modifiedArray = deleteElement(array, indexToDelete);

      if (modifiedArray != null) {
          System.out.println("\nArray after deleting element at index " + indexToDelete + ": ");
          printArray(modifiedArray);
      }
  }

  public static int[] deleteElement(int[] array, int index) {
   
      if (index < 0 || index >= array.length) {
          System.out.println("Invalid index.");
          return array; 
      }

   
      int[] newArray = new int[array.length - 1];


      for (int i = 0, j = 0; i < array.length; i++) {
          if (i != index) {
              newArray[j] = array[i];
              j++;
          }
      }

      return newArray;
  }

  public static void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
      }
  }
}