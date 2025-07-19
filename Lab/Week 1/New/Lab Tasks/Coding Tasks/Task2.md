# Task 2
---

## Question

---


**Task 2.1**
Declare an integer variable. Initialize it with some value of your choice and print it to check the value has been stored properly.

**Task 2.2** 
Declare and initialize another integer variable. Add this to the first one and print out the result. Verify that the addition has been done correctly.

**Task 2.3**
Now print the product and division of the two integer numbers.

**Task 2.4**
Repeat exercises 2.1, 2.2, and 2.3 for variables of data type double. Verify your answers.

**Task 2.5**
Repeat exercises 2.1, 2.2, and 2.3 for one double data type and one integer datatype. Verify your answers.

**Task 2.6**
Repeat exercises 2.1 and 2.2 for variables of data type String. How does the addition operator work for Strings? What if the first variable is an integer and the second is a String and vice versa?

---

## Solution

---

**Solution 2.1**

```java
public class Main {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("The number to print is: " + num);
    }
}
```

**Output**
```
The number to print is: 10
```

---

**Solution 2.2**

```java
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("The first number is       : " + num1);
        System.out.println("The second number is      : " + num2);
        System.out.println("The sum of both numbers is: " + (num1 + num2));
    }
}
```

**Output**
```
The first number is       : 10
The second number is      : 20
The sum of both numbers is: 30
```

---

**Solution 2.3**

```java
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("The first number is            : " + num1);
        System.out.println("The second number is           : " + num2);
        System.out.println("The product of both numbers is : " + (num1 * num2));
        System.out.println("The division of both numbers is: " + (num1 / num2));
    }
}
```

**Output**
```
The first number is            : 10
The second number is           : 20
The product of both numbers is : 200
The division of both numbers is: 0
```

---

**Solution 2.4**

```java
public class Main {
    public static void main(String[] args) {
        double num1 = 10.47;
        double num2 = 20.22;
        
        System.out.println("The first number is           : " + num1);
        System.out.println("The second number is          : " + num2);
        System.out.println("The sum of both numbers is    : " + (num1 + num2));
        System.out.println("The product of both numbers is: " + (num1 * num2));
        System.out.println("The division of both numbers is: " + (num1 / num2));
    }
}
```

**Output**
```
The first number is           : 10.47
The second number is          : 20.22
The sum of both numbers is    : 30.689999999999998
The product of both numbers is: 211.7034
The division of both numbers is: 0.5178041543026707
```

---

**Solution 2.5**

```java
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 20.22;
        
        System.out.println("The first number is           : " + num1);
        System.out.println("The second number is          : " + num2);
        System.out.println("The sum of both numbers is    : " + (num1 + num2));
        System.out.println("The product of both numbers is: " + (num1 * num2));
        System.out.println("The division of both numbers is: " + (num1 / num2));
    }
}
```

**Output**
```
The first number is           : 10
The second number is          : 20.22
The sum of both numbers is    : 30.22
The product of both numbers is: 202.2
The division of both numbers is: 0.49455984174085066
```

---

**Solution 2.6**

```java
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Human";

        System.out.printf("The first string is  : %s%n", str1);
        System.out.printf("The second string is : %s%n", str2);
        System.out.printf("The output should be : %s%n%n", str1 + str2);

        int integer_number = 10;
        String string_variable = "USD";

        System.out.printf("The integer value is  : %d%n", integer_number);
        System.out.printf("The string value is   : %s%n", string_variable);
        System.out.printf("The output should be  : %s%n%n", integer_number + string_variable);

        String string_variable2 = "Age";
        int integer_number2 = 22;

        System.out.printf("The second string value is   : %s%n", string_variable2);
        System.out.printf("The second integer value is  : %d%n", integer_number2);
        System.out.printf("The output should be         : %s%n", string_variable2 + integer_number2);
    }
}
```

**Output**
```
The first string is  : Hello
The second string is : Human
The output should be : HelloHuman

The integer value is  : 10
The string value is   : USD
The output should be  : 10USD

The second string value is   : Age
The second integer value is  : 22
The output should be         : Age22
```

