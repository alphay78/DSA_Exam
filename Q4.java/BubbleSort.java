public class BubbleSort {
  public static void bubbleSort(int[] arr) {
      int n = arr.length;
      
      for (int i = 0; i < n; i++) {
         
          for (int j = 0; j < n - i - 1; j++) {
              
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
      }
  }

  public static void main(String[] args) {
      int[] alphabetArr = new int[]{'b', 'u', 'b', 'b', 'l', 'e', 'S', 'o', 'r', 't'};
      bubbleSort(alphabetArr);
      StringBuilder sortedAlphabet = new StringBuilder();
      for (int i : alphabetArr) {
          sortedAlphabet.append((char) i);
      }
      System.out.println("Sorted array of alphabets: " + sortedAlphabet);
  }
}