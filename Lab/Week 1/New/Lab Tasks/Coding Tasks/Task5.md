# Task 5
---

## Question

---

**Task 5**

Write a Java program that, given a number in inches (you have to declare and initialize it yourself) converts it to meters. 

**Note:** One inch is 0.0254 meters.

**Test Data:** Given a value for inch: 1000
**Expected Output:** 1000 inch is 25.4 meters

---

## Solution
---

**Solution 5**

```java
public class Main {
    public static void main(String[] args) {
        double inch = 1000;
        double meter = inch * 0.0254;

        System.out.printf("The number in inch is  : %10.2f%n", inch);
        System.out.printf("The number in meter is : %10.4f%n", meter);
    }
}
```

**Output**
```
The number in inch is  :     1000.00
The number in meter is :     25.4000
```