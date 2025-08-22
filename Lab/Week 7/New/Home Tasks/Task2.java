import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int array[] = new int[input];

        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextInt();
        }
        int numberToFind = scanner.nextInt();
        boolean isFound = false;

        for (int i = 0; i < input; i++) {
            if (array[i] == numberToFind) {
                System.out.println(array[i] + " is at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found");
        }
        scanner.close();
    }
}
