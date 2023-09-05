```java
public class Test {
    static int i;
    public static void main(String[] args) {
        int i, j, k= 10; // Line 1
        i = Test.i+k; // Line 2
        k = i+++k;  // Line 3
        Test.i = j+i; // Line 4
        System.out.println(i+" " +k);
    }
}
```
What is the result of compiling and running this code?

- Compile error occurs on Line 1
- Compile error occurs on Line 2
- Compile error occurs on Line 3
- Compile error occurs on Line 4
- Code compiles fine and prints 10 21
 ---

```java
public class Test {
    public static void main(String[] args) {
        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1=!input2);  // Line 4
        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3);
    }
}
```
What is the result of compiling and running this code?

- false true true false
- false true false true
- false false false false
- true false false true
- Compile error
 ---