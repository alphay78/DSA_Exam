import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

       
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        
        int i = 0, j = 0;

       
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

       
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

   
        mergeSort(nums, 0, nums.length - 1);

        
        System.out.print("Enter a number to be searched: ");
        int target = scanner.nextInt();

        int occurrences = 0;
        for (int num : nums) {
            if (num == target) {
                occurrences++;
            }
        }

    
        if (occurrences > 0) {
            System.out.println("The number " + target + " appears " + occurrences + " times in the array.");
        } else {
            System.out.println("The number " + target + " is not present in the array.");
        }
    }
}