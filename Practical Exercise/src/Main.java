import java.util.Scanner;

class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the list
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Input the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the input numbers
        System.out.println("Input numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        // Close the scanner
        scanner.close();
    }
}