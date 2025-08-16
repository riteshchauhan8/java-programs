import java.util.Scanner;

public class ArrayOperations {

    // i) Display elements
    static void displayElements(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ii) Sum of elements
    static int sumElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // iii) Largest element
    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // iv) Smallest element
    static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // v) Second largest element
    static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? first : second;
    }

    // vi) Sum of alternate elements
    static int sumAlternate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    // vii) Count of even numbers
    static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                count++;
        }
        return count;
    }

    // viii) Frequency of a number
    static int frequencyOfNumber(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            int[] arr = new int[5];

            // a) Get user input
            System.out.println("Enter 5 integers for the array:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            boolean valid = true;
            do {
    
                System.out.println("\nChoose an operation:");
                System.out.println("1. Display array elements");
                System.out.println("2. Sum of all elements");
                System.out.println("3. Largest number");
                System.out.println("4. Smallest number");
                System.out.println("5. Second largest number");
                System.out.println("6. Sum of alternate elements");
                System.out.println("7. Count of even numbers");
                System.out.println("8. Frequency of a number");
                System.out.print("Enter your choice (1-8): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        displayElements(arr);
                        break;
                    case 2:
                        System.out.println("Sum: " + sumElements(arr));
                        break;
                    case 3:
                        System.out.println("Largest: " + findLargest(arr));
                        break;
                    case 4:
                        System.out.println("Smallest: " + findSmallest(arr));
                        break;
                    case 5:
                        System.out.println("Second Largest: " + findSecondLargest(arr));
                        break;
                    case 6:
                        System.out.println("Sum of Alternate Elements: " + sumAlternate(arr));
                        break;
                    case 7:
                        System.out.println("Even Numbers Count: " + countEven(arr));
                        break;
                    case 8:
                        System.out.print("Enter number to find frequency: ");
                        int target = scanner.nextInt();
                        int freq = frequencyOfNumber(arr, target);
                        System.out.println("Frequency of " + target + ": " + freq);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        valid = false;
                }

                System.out.println();

            } while (!valid);

            System.out.print("Do you want to try with another array? (Press 'N' to exit): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice != 'N' && continueChoice != 'n');

        System.out.println("Program exited.");
        scanner.close();
    }
}