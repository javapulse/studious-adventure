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

```java
public class Test {
    static String type = "this";

    public static void main(String[] args) {
        String s = (args.length > 0) ? "switch" : "";
        String caseVal = (args.length > 1) ? args[1] : "";

        if (s == "switch") {
            String type;  // Line 1
            switch (caseVal) {

                case "this":
                    type = "that";
                    break;
                case "that":
                    type = "this";
                    break;
                case "other":
                default:
                    type = "somethingelse";
            }
            if (type=="that") type="this";  //Line 2

        }
        System.out.println("this is " + type);  //Line 3
    }
}
```
If you desire to have the outcome print "this is this", which of the following commands produces this result. Only one response is allowed so review all the responses first?

- java Test switch that
- java Test switch this
- java Test switch
- java Test that
- true Test
- All of commands above have the same outcome and print "this is this"
 ---

```java
public class Test {
    static float tax_rate =0.06F;
    public static void main(String[] args) {

        var result = 0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
        result = price + adjusted_tax;  // Line 3
        System.out.println("Adjusted price = " + result);
    }
}
```
What is the result of compiling and running this code?

- Code runs and prints: Adjusted price = 106
- Code runs and prints: Adjusted price = 105.00
- Compile error occurs on Line 1
- Compile error occurs on Line 2
- Compile error occurs on Line 3
---