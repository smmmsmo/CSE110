# Task 6
---

## Question

---

**Task 6**
Write a Java program declaring two integer variables and initializing them. Your task is to swap the values of these two variables. You must complete it using two different approaches.

**Task 6.a**
By creating a third variable.

**Task 6.b**
Without creating any other variables.

---

## Solution
---

**Solution 6.1**

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("Variable before the swap%n%n");
        System.out.printf("The number was        : %5d%n", a);
        System.out.printf("The second number was : %5d%n%n", b);

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Variable after the swap%n%n");
        System.out.printf("The number was        : %5d%n", a);
        System.out.printf("The second number was : %5d%n", b);
    }
}
```

**Output**
```
Variable before the swap

The first number was        :    10
The second number was       :    20

Variable after the swap

The first number is         :    20
The second number is        :    10
```

---

**Solution 6.2**

```java
public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 11;

        System.out.printf("Variable before the swap%n%n");
        System.out.printf("The number was        : %5d%n", a);
        System.out.printf("The second number was : %5d%n%n", b);

        a = a + b; // a = 18
        b = a - b; // b = 7
        a = a - b; // a = 11

        System.out.printf("Variable after the swap%n%n");
        System.out.printf("The number was        : %5d%n", a);
        System.out.printf("The second number was : %5d%n", b);
    }
}
```

**Output**
```
Variable before the swap

The first number was        :     7
The second number was       :    11

Variable after the swap

The first number is         :    11
The second number is        :     7
```