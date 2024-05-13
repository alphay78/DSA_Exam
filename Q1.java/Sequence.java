import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print(" Enter length of the sequence: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        System.out.println("Enter sequence of numbers:");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        System.out.print("Enter  number to be searched: ");
        int target = scanner.nextInt();

       
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }

       
        if (count > 0) {
            System.out.println("The number " + target + " appears " + count + " times in the array.");
        } else {
            System.out.println("The number " + target + " is not present in the array.");
        }

        scanner.close();
    }
}