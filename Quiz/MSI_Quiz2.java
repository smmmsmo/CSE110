/* 


Today is your birthday, and to celebrate, you went to a restaurant called ABCD Cafe. There are a total of N items.
Among them, some are out of your budget because they are overpriced, while others are within your budget.
Write a Java program that first takes an integer N (the number of items), followed by N space-separated prices
and your budget for each item as input. The program should count the number of items within the budget,
compute their percentage relative to N, and count the number of overpriced items. If the number of overpriced
items exceeds 5, print "Warning: Too many items are overpriced." (7 marks)

|`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````|
|   Sample Input:                                           |   Sample Output:                                            |
|   N = 10                                                  |   Items within budget: 4                                    |
|   Prices: 100 999 250 999 990 500 40 800 705 300          |   Percentage: 40%                                           |
|   Budget per item: 400                                    |   Items overpriced: 6                                       |
|                                                           |   Warning: Too many items are overpriced.                   |
```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````

Explanation: Out of 10, 4 items (100, 250, 40, 300) are within budget, and 6 (999, 999, 990, 500, 800, 705) items
are overpriced. Therefore, the percentage of items within budget is 40%.   


*/

import java.util.Scanner;

public class MSI_Quiz2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items (N) : ");
        int N = scanner.nextInt();

        System.out.print("Enter your budget: ");
        int budget = scanner.nextInt();

        int i = 1, overpriced = 0, within_budget = 0;

        System.out.println("Enter the prices separated by spaces:");

        while (i <= N) {
            int price = scanner.nextInt();
            if (price > budget) {
                // System.out.println(price + " is greater than your budget.");
                overpriced++;

            } else if (price <= budget) {
                // System.out.println(price + " is less than your budget.");
                within_budget++;
            }
            i++;
        }

        System.out.println("overpriced item number is : " + overpriced);
        System.out.println("within budget item number is : " + within_budget);

        System.out.println("percentage  of within budget items is : " + (within_budget * 100) / N + "%");

        if (overpriced > 5) {
            System.out.println("Warning: Too many items are overpriced.");
        }
        scanner.close();
    }
}