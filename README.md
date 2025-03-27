# Number Diamond Pattern in Java

## Description
This Java program prints a symmetrical number diamond pattern based on user input. The pattern consists of an increasing sequence of numbers from `1` to `n` at the center, followed by a decreasing sequence, creating a diamond shape. The upper half of the pattern expands while the lower half mirrors it. Nested loops are used to manage spacing and number placement efficiently.

---

## Code Implementation

```java
package number_patterns;

import java.util.Scanner;
public class Number_Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        
        // Upper half of the diamond
        for(int i=0; i<=n; i++)
        {
            int num = 1;
            for(int j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<i; j++)
            {
                System.out.print(num++);
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(num--);
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for(int i=0; i<=n; i++)
        {
            int num = 1;
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<n; j++)
            {
                System.out.print(num++);
            }
            for(int j=i; j<=n; j++)
            {
                System.out.print(num--);
            }
            System.out.println();
        }
    }
}
```

---

## Detailed Explanation

### 1. Scanner Class
The `Scanner` class is used to take input from the user. It belongs to the `java.util` package and allows reading various data types from input sources.

- `Scanner s = new Scanner(System.in);` → Creates a Scanner object to read input.
- `int n = s.nextInt();` → Reads an integer from the user and stores it in `n`.

### 2. Variables Used
- `n`: Stores the size of the diamond pattern as entered by the user.
- `num`: Used to handle the numbering logic within the loops.

### 3. Outer `for` Loops
- The first outer loop (`for(int i=0; i<=n; i++)`) prints the upper half of the diamond.
- The second outer loop (`for(int i=0; i<=n; i++)`) prints the lower half of the diamond.

### 4. Inner `for` Loops
Each outer loop contains three inner loops:

#### **Upper Half Loops:**
1. `for(int j=i; j<=n; j++)` → Prints leading spaces to align numbers properly.
2. `for(int j=1; j<i; j++)` → Prints increasing numbers.
3. `for(int j=1; j<=i; j++)` → Prints decreasing numbers.

#### **Lower Half Loops:**
1. `for(int j=1; j<=i; j++)` → Prints leading spaces for alignment.
2. `for(int j=i; j<n; j++)` → Prints increasing numbers.
3. `for(int j=i; j<=n; j++)` → Prints decreasing numbers.

### 5. Printing Statements
- `System.out.print(" ");` → Prints spaces to position numbers correctly.
- `System.out.print(num++);` → Prints numbers in increasing order.
- `System.out.print(num--);` → Prints numbers in decreasing order.
- `System.out.println();` → Moves to the next line after printing one row.

### 6. Conditions and Execution Flow
- The loops manage spacing, increasing numbers, and decreasing numbers to form the diamond shape.
- The upper half expands numbers from 1 to `n`, and the lower half mirrors the upper part.

---

## Example Output
```
Enter the size
5
     1
    121
   12321
  1234321
 123454321
12345654321
 123454321
  1234321
   12321
    121
     1
```

---

## Key Features
✅ Uses nested loops efficiently.  
✅ Generates a perfectly symmetrical number diamond.  
✅ Dynamic pattern size based on user input.  
✅ Demonstrates the use of `Scanner`, loops, and print statements in Java.  

---

## Conclusion
This program is an excellent example of using nested loops to generate structured patterns in Java. It enhances understanding of control flow, number manipulation, and the importance of proper indentation using spaces.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Numbered_Diamond.git
```
