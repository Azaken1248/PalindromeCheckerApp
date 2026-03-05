# PalindromeCheckerApp

A console-based Java application designed to validate whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts. 

## [Use Case 1](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC1-PalindromeApp)

To display a welcome message and application details at startup to establish a clear execution flow. 

#### key concept

(1) Using the **static** keyword to allow the JVM to invoke the entry point without object instantiation. 

```java
public static void main(String[] args) {
    System.out.println("Welcome to the Palindrome Checker Management System");
    System.out.println("Version: 1.0");
}

```

(2) Utilizing **System.out.println()** for console output to communicate system initialization status to the user. 

## [Use Case 2](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC2-PalindromeApp)

To validate a hardcoded string using basic comparison logic before introducing advanced structures. 

#### key concept

(1) Implementation of **conditional statements (if-else)** to evaluate if the predefined string satisfies palindrome conditions. 

```java
if (isPalindrome) {
    System.out.println("Is it a Palindrome?: true");
} else {
    System.out.println("Is it a Palindrome?: false");
}

```

(2) Leveraging the **String** class for storing and manipulating textual data within the constant pool. 

## [Use Case 3](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC3-PalindromeApp)

To check for palindromes by reversing the input string and comparing it with the original value. 

#### key concept

(1) Using a **for loop** to iterate through the characters of the string in reverse order. 

```java
for (int i = input.length() - 1; i >= 0; i--) {
    reversed += input.charAt(i);
}

```

(2) Employing the **equals()** method to compare the actual content of String objects rather than their memory references. 

## [Use Case 4](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC4-PalindromeApp)

To optimize validation efficiency and reduce memory usage by using a character array and the two-pointer technique. 

#### key concept

(1) Converting strings to a **character array (char[])** for efficient index-based access to individual characters. 

```java
char[] chars = input.toCharArray();
int start = 0;
int end = chars.length - 1;

```

(2) Applying the **Two-Pointer Technique** to compare characters from both ends simultaneously, reducing unnecessary iterations. 

## [Use Case 5](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC5-PalindromeApp)

To validate palindromes using the **LIFO (Last In First Out)** principle of a Stack data structure. 

#### key concept

(1) Mapping stack behavior to reversal logic by **pushing** characters and then **popping** them to compare with the original sequence. 

```java
Stack<Character> stack = new Stack<>();
for (char c : input.toCharArray()) {
    stack.push(c);
}

```

(2) Demonstrating how a **Stack** naturally reverses element order, making it suitable for symmetry validation. 

## [Use Case 6](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC6-PalindromeApp)

To demonstrate the behavioral differences between **FIFO** and **LIFO** by combining Queue and Stack structures. 

#### key concept

(1) Using a **Queue** to maintain First In First Out order for front-to-back comparison. 

```java
while (!queue.isEmpty()) {
    if (!queue.poll().equals(stack.pop())) {
        isPalindrome = false;
        break;
    }
}

```

(2) Performing a **logical comparison** by matching dequeue output with pop output to confirm string symmetry. 

## [Use Case 7](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC7-PalindromeApp)

To implement an optimized bidirectional traversal using a **Deque (Double-Ended Queue)**. 

#### key concept

(1) Utilizing **removeFirst()** and **removeLast()** to compare elements from both ends without creating a reversed string. 

```java
while (deque.size() > 1) {
    if (!deque.removeFirst().equals(deque.removeLast())) {
        isPalindrome = false;
        break;
    }
}

```

(2) Achieving **optimized data handling** by eliminating the need for separate reversal structures or additional memory allocations. 

## [Use Case 8](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC8-PalindromeApp)

To validate palindromes using a **LinkedList** to demonstrate dynamic data structure management. 

#### key concept

(1) Applying the **Fast and Slow Pointer Technique** to find the middle of the list efficiently. 

(2) Performing an **In-Place Reversal** of the second half of the linked list to compare halves without extra memory. 

## [Use Case 9](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC9-PalindromeApp)

To implement a **recursive** approach for palindrome checking, demonstrating divide-and-conquer logic. 

#### key concept

(1) Defining a **base condition** to exit recursion when all characters match or a mismatch is found. 

```java
private static boolean check(String s, int start, int end) {
    if (start >= end) return true;
    if (s.charAt(start) != s.charAt(end)) return false;
    return check(s, start + 1, end - 1);
}

```

(2) Managing method calls through the **Call Stack** memory structure during the inward movement of the recursive comparison. 

## [Use Case 10](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC10-PalindromeApp)

To perform **normalization** on input strings, ensuring checks are logic-based rather than format-dependent. 

#### key concept

(1) **String preprocessing** to remove spaces and symbols while converting the text to lowercase. 

```java
String normalized = input.replaceAll("[^a-zA-Z0-0]", "").toLowerCase();

```

(2) Utilizing **Regular Expressions** to handle complex string cleaning patterns for robust validation. 

## [Use Case 11](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC11-PalindromeApp)

To encapsulate validation logic within an **Object-Oriented** service for better modularity. 

#### key concept

(1) Applying the **Single Responsibility Principle** by separating the driver class from the palindrome logic service. 

```java
class PalindromeService {
    public boolean checkPalindrome(String input) {
        // logic here
    }
}

```

(2) **Encapsulation** of internal data structures (Stack/Array) to hide implementation details from the client. 

## [Use Case 12](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC12-PalindromeApp)

To implement the **Strategy Design Pattern** for selecting different validation algorithms at runtime. 

#### key concept

(1) Defining a common **interface** to establish a contract for all palindrome checking algorithms. 

```java
interface PalindromeStrategy {
    boolean check(String input);
}

```

(2) Using **Polymorphism** to inject different strategies (Stack, Deque, etc.) into the application dynamically. 

## [Use Case 13](https://github.com/Azaken1248/PalindromeCheckerApp/tree/feature/UC13-PalindromeApp)

To perform a **performance comparison** between different algorithmic approaches. 

#### key concept

(1) Using **System.nanoTime()** to capture high-resolution start and end times for benchmarking. 

(2) Calculating and displaying the **execution duration** to provide quantitative data on algorithm efficiency. 

## Integration Pipeline

Each feature is developed on a separate branch.
