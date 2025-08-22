import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        int arrayNumber = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array " + arrayNumber++ + ":");
        int input = scanner.nextInt();
        int array[] = new int[input];
        System.out.println("Enter elements for array 1:");
        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the length of array " + arrayNumber++ + ":");
        int input2 = scanner.nextInt();
        int array2[] = new int[input2];

        for (int i = 0; i < input2; i++) {
            array2[i] = scanner.nextInt();
        }

        boolean isSubset = true;

        for (int i = 0; i < input2; i++) {
            boolean found = false;

            for (int j = 0; j < input; j++) {
                if (array2[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("Array 2 is a subset of Array 1");
        } else {
            System.out.println("Array 2 is not a subset of Array 1");
        }

        scanner.close();
    }
}
