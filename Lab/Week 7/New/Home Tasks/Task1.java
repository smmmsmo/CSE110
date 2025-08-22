import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int array[] = new int[input];

        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");

        for (int i = 0; i < input; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("After modifying:");

        for (int i = 0; i < input; i++) {
            if (array[i] > 0) {
                array[i] = 1;
            } else if (array[i] <= 0) {
                array[i] = 0;
            }
        }

        for (int i = 0; i < input; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();

    }
}
