import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int input = scanner.nextInt();
        double array[] = new double[input];

        for (int i = 0; i < input; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextDouble();
        }

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < input; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            sum += array[i];
        }

        double average = sum / input;

        System.out.println("Maximum element: " + max + " found at index: " + maxIndex);
        System.out.println("Minimum element: " + min + " found at index: " + minIndex);
        System.out.println("Summation of all elements: " + sum);
        System.out.format("Average of all elements: %.2f%n", average);

        scanner.close();
    }
}
