# Task 3
---

## Question

---


**Task 3**
Write Java code that calculates and prints the circumference and area of a circle with a radius of 4 units. [Hint: use Math.PI to get the value of π]

---

## Solution

**Solution 3**

```java
public class Main {
    public static void main(String[] args) {
        double radius = 4.0;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("The radius is        : %10.2f%n", radius);
        System.out.printf("The circumference is : %10.4f%n", circumference);
        System.out.printf("The area is          : %10.4f%n", area);
    }
}
```

**Output**
```
The radius is        :       4.00
The circumference is :    25.1327
The area is          :    50.2655
```