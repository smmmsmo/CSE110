# Task 4
---

## Question

---

**Task 4**
Write a Java code where given an integer, we need to print the last 2 digits of that number.

---

## Solution
---

**Solution 4**

```java
public class Main {
    public static void main(String[] args) {
        int num = 7530;
        int last_digit = num % 100;

        System.out.printf("The number is                      : %d%n", num);
        System.out.printf("The last 2 digit of the number is : %d%n", last_digit);
    }
}
```

**Output**
```
The number is                     : 7530
The last 2 digit of the number is : 30
```

