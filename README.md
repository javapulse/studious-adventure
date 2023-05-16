# studious-adventure
> Java Interview Questions

<br/>

## Table of Contents

* [Introduction](#-1-introduction)
* [Java Architecture](#-2-java-architecture)
* [Java Data Types](#-3-java-data-types)
* [Java OOP](#-4-java-oop)

<br/>

## # 1. INTRODUCTION

<br/>

## Q. Can we use reserved word as identifier?
```java
String final = "string"; // invalid statement
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. Can we use predefined class name as identifier?

Yes we can use. But it isn't recommended to.

```java
String String = "string";
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. What are literals?

Literals are the constant values which can be assigned to the variable.

```java
String value = "string"; // "string" is a literal.
```

NOTE: Java provides 3 literals -> null, true, false.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## # 2. JAVA ARCHITECTURE

<br/>

## Q. What is JVM and is it platform independent?

Java Virtual Machine (JVM) is a specification that provides runtime environment in which java bytecode(.class files) can be executed. The JVM is the platform. The JVM acts as a "virtual" machine or processor. Java\'s platform independence consists mostly of its Java Virtual Machine (JVM). JVM makes this possible because it is aware of the specific instruction lengths and other particularities of the platform (Operating System).

The JVM is not platform independent. Java Virtual Machine (JVM) provides the environment to execute the java file(. Class file). So at the end it's depends on kernel and kernel is differ from OS (Operating System) to OS. The JVM is used to both translate the bytecode into the machine language for a particular computer and actually execute the corresponding machine-language instructions as well.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What is JIT compiler in Java?

The Just-In-Time (JIT) compiler is a component of the runtime environment that improves the performance of Java applications by compiling bytecodes to native machine code at run time.

Java programs consists of classes, which contain platform-neutral bytecodes that can be interpreted by a JVM on many different computer architectures. At run time, the JVM loads the class files, determines the semantics of each individual bytecode, and performs the appropriate computation. The additional processor and memory usage during interpretation means that a Java application performs more slowly than a native application. The JIT compiler helps improve the performance of Java programs by compiling bytecodes into native machine code at run time. The JIT compiler is enabled by default. When a method has been compiled, the JVM calls the compiled code of that method directly instead of interpreting it.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What is Classloader in Java?

The **Java ClassLoader** is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine. Java code is compiled into class file by javac compiler and JVM executes Java program, by executing byte codes written in class file. ClassLoader is responsible for loading class files from file system, network or any other source.

**Types of ClassLoader:**

**1. Bootstrap Class Loader**:

It loads standard JDK class files from rt.jar and other core classes. It loads class files from jre/lib/rt.jar. For example, java.lang package class.

**2. Extensions Class Loader**:

It loads classes from the JDK extensions directly usually `JAVA_HOME/lib/ext` directory or any other directory as java.ext.dirs.

**3. System Class Loader**:

It loads application specific classes from the CLASSPATH environment variable. It can be set while invoking program using -cp or classpath command line options.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. Java Compiler is stored in JDK, JRE or JVM?

**1. JDK**:

Java Development Kit is the core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.

**2. JVM**:

JVM is responsible for converting Byte code to the machine specific code. JVM is also platform dependent and provides core java functions like memory management, garbage collection, security etc. JVM is customizable and we can use java options to customize it, for example allocating minimum and maximum memory to JVM. JVM is called virtual because it provides an interface that does not depend on the underlying operating system and machine hardware.

**2. JRE**:

Java Runtime Environment provides a platform to execute java programs. JRE consists of JVM and java binaries and other classes to execute any program successfully.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What is difference between Heap and Stack Memory in java?

**1. Java Heap Space:**  

Java Heap space is used by java runtime to allocate memory to **Objects** and **JRE classes**. Whenever we create any object, it\'s always created in the Heap space.

Garbage Collection runs on the heap memory to free the memory used by objects that doesn\'t have any reference. Any object created in the heap space has global access and can be referenced from anywhere of the application.

**2. Java Stack Memory:**

Stack in java is a section of memory which contains **methods**, **local variables** and **reference variables**. Local variables are created in the stack.

Stack memory is always referenced in LIFO ( Last-In-First-Out ) order. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method.

As soon as method ends, the block becomes unused and become available for next method. Stack memory size is very less compared to Heap memory.

**Difference:**  

|Parameter	       |Stack Memory	               |Heap Space                       |
|------------------|-----------------------------|-----------------------------------|
|Application	   |Stack is used in parts, one at a time during execution of a thread|	The entire application uses Heap space during runtime|
|Size	           |Stack has size limits depending upon OS and is usually smaller then Heap|There is no size limit on Heap|
|Storage	       |Stores only primitive variables and references to objects that are created in Heap Space|All the newly created objects are stored here|
|Order	           |It is accessed using Last-in First-out (LIFO) memory allocation system|	This memory is accessed via complex memory management techniques that include Young Generation, Old or Tenured Generation, and Permanent Generation.|
|Life	           |Stack memory only exists as long as the current method is running|Heap space exists as long as the application runs|
|Efficiency	       |Comparatively much faster to allocate when compared to heap| Slower to allocate when compared to stack|
|Allocation/Deallocation| This Memory is automatically allocated and deallocated when a method is called and returned respectively|Heap space is allocated when new objects are created and deallocated by Gargabe Collector when they are no longer referenced |

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. How many types of memory areas are allocated by JVM?

JVM is a program which takes Java bytecode and converts the byte code (line by line) into machine understandable code. JVM perform some particular types of operations:

* Loading of code
* Verification of code
* Executing the code
* It provide run-time environment to the users

**Types of Memory areas allocated by the JVM:**  

**1. Classloader**: Classloader is a subsystem of JVM that is used to load class files.

**2. Class(Method) Area**: Class(Method) Area stores per-class structures such as the runtime constant pool, field and method data, the code for methods.

**3. Heap**: It is the runtime data area in which objects are allocated.  

**4. Stack**: Java Stack stores frames.It holds local variables and partial results, and plays a part in method invocation and return. Each thread has a private JVM stack, created at the same time as thread.

**5. Program Counter Register**: PC (program counter) register. It contains the address of the Java virtual machine instruction currently being executed.  

**6. Native Method Stack**: It contains all the native methods used in the application.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## # 3. JAVA DATA TYPES

<br/>

## Q. What are autoboxing and unboxing?

The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and opposite operation is known as unboxing.

**Example:** Autoboxing

```java
/**
 * Autoboxing
 */
class BoxingExample {
    public static void main(String args[]) {
        int a = 50;
        Integer a2 = new Integer(a); // Boxing
        Integer a3 = 5; // Boxing

        System.out.println(a2 + " " + a3);
    }
} 
```

**Example:** Unboxing

```java
/**
 * Unboxing
 */
class UnboxingExample {
    public static void main(String args[]) {
        Integer i = new Integer(50);
        int a = i;

        System.out.println(a);
    }
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What is the difference between transient and volatile variable in Java?

**1. Transient:**

The transient modifier tells the Java object serialization subsystem to exclude the field when serializing an instance of the class. When the object is then deserialized, the field will be initialized to the default value; i.e. null for a reference type, and zero or false for a primitive type.

**Example:**

```java
/**
 * Transient
 */
public transient int limit = 55;   // will not persist
public int b;   // will persist
```

**2. Volatile:**

The volatile modifier tells the JVM that writes to the field should always be synchronously flushed to memory, and that reads of the field should always read from memory. This means that fields marked as volatile can be safely accessed and updated in a multi-thread application without using native or standard library-based synchronization.

**Example:**

```java
/**
 * Volatile
 */
public class MyRunnable implements Runnable {
   private volatile boolean active;
   public void run() {
      active = true;
      while (active) {    
      }
   }
   public void stop() {
      active = false;  
   }
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What are assertions in Java?

An assertion allows testing the correctness of any assumptions that have been made in the program. Assertion is achieved using the assert statement in Java.

While executing assertion, it is believed to be true. If it fails, JVM throws an error named `AssertionError`. It is mainly used for testing purposes during development.

The assert statement is used with a Boolean expression and can be written in two different ways.

```java
// First way 
assert expression;

// Second way
assert expression1 : expression2;
```

**Example:**

```java
/**
 * Assertions
 */
public class Example {
    public static void main(String[] args) {
        int age = 14;
        assert age <= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What is the final variable, final class, and final blank variable?

**1. Final Variable:**

Final variables are nothing but constants. We cannot change the value of a final variable once it is initialized.

**Example:**

```java
/**
 * Final Variable
 */
class Demo {

    final int MAX_VALUE = 99;

    void myMethod() {
        MAX_VALUE = 101;
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
```

Output

```java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final field Demo.MAX_VALUE cannot be assigned

	at beginnersbook.com.Demo.myMethod(Details.java:6)
	at beginnersbook.com.Demo.main(Details.java:10)
```

**2. Blank final variable:**

A final variable that is not initialized at the time of declaration is known as blank final variable. We must initialize the blank final variable in constructor of the class otherwise it will throw a compilation error ( Error: `variable MAX_VALUE might not have been initialized` ).

**Example:**

```java
/**
 * Blank final variable
 */
class Demo {
    // Blank final variable
    final int MAX_VALUE;

    Demo() {
        // It must be initialized in constructor
        MAX_VALUE = 100;
    }

    void myMethod() {
        System.out.println(MAX_VALUE);
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
```

Output

```java
100
```

**3. Final Method:**

A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it.

**Example:**

```java
/**
 * Final Method
 */
class XYZ {
    final void demo() {
        System.out.println("XYZ Class Method");
    }
}

class ABC extends XYZ {
    void demo() {
        System.out.println("ABC Class Method");
    }

    public static void main(String args[]) {
        ABC obj = new ABC();
        obj.demo();
    }
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What is a compile time constant in Java?

If a primitive type or a string is defined as a constant and the value is known at compile time, the compiler replaces the constant name everywhere in the code with its value. This is called a compile-time constant.

**Compile time constant must be:**  

* Declared final
* Primitive or String
* Initialized within declaration
* Initialized with constant expression

They are replaced with actual values at compile time because compiler know their value up-front and also knows that it cannot be changed during run-time.

```java
private final int x = 10;
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>

## Q. What are the different access specifiers available in java?

* access specifiers/modifiers helps to restrict the scope of a class, constructor, variable, method, or data member.
* There are four types of access modifiers available in java:
    1. `default` – No keyword required, when a class, constructor,variable, method, or data member declared without any access specifier then it is having default access scope i.e. accessible only within the same package.
    2. `private` - when declared as a private , access scope is limited within the enclosing class.
    3. `protected` - when declared as protocted, access scope is limited to enclosing classes, subclasses from same package as well as other packages.
    4. `public` - when declared as public, accessible everywhere in the program.

```java
    ... /* data member variables */
    String firstName="Pradeep";     /* default scope */
    protected isValid=true;         /* protected scope */
    private String otp="AB0392";    /* private scope */
    public int id = 12334;          /* public scope */
    ...
    ... /* data member functions */
    String getFirstName(){ return this.firstName; } /* default scope */
    protected boolean getStatus(){this.isValid;}    /* protected scope */
    private void generateOtp(){                     /* private scope */
        this.otp = this.hashCode() << 16;
    };    
    public int getId(){ return this.id; }           /* public scope */
    ...
    .../* inner classes */
    class A{}            /* default scope */
    protected class B{}  /* protected scope */
    private class C{}    /* private scope */
    public class D{}     /* public scope */
    ...
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## # 4. JAVA OOP

<br/>

## Q. Can a class or a method be abstract and final at the same time?

A class or method cannot be abstract and final at the same time.
- `final` restricts the component to be modified further.
- `abstract` make component available to be modified further.

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. When are static variables loaded in memory?

Static variables are loaded in memory at the time of class loading. When the JVM loads a class, it allocates memory for all of the static variables defined in the class and initializes them to their default values (which are 0, false, or null, depending on the data type).

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. Can we declare final variable without initialization?

No, it's not possible to declare a final variable without initializing it in the same statement.
[Java Language Specification 8.3.1.2](https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.3.1.2)

```java
private final int blankFinal; // this will cause a compile-time error
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. What is difference between abstract class and interface?

- In abstract class, we can have both abstract and concrete methods where as in interface, we can only have abstract methods.
- A class can only extend one abstract class, but it can implement multiple interfaces.
- Abstract class can have `static`, `final` or `static final` variables with any access specifier where as in interface, we can have only `static final` variable by default.

```java
public abstract class Shape {
    protected int x;
    protected int y;
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();
}


public interface Drawable {
    void draw();
    void setColor(String color);
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. What are the various types of inheritance?

- Single Inheritance: a single class extends another class.

```java
class A {}
class B extends A {}
```

- Multilevel Inheritance: in this case, there are multiple level of inheritance.

```java
class A {}
class B extends A {}
class C extends B {}
```

- Multiple Inheritance: a single class extends more than 1 class. Java does not support this type of inheritance, because if a class extends more than one class then change of ambiguity problem if there is any method present with same name.
However multiple inheritance is possible with interfaces.

- Hierarchical Inheritance: 

```java
class A {}
class B extends A {}
class C extends A {}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. What is Diamond Problem in inheritance?

If a class extends two classes, change of ambiguity problem. This is called as Diamond Access problem.

```java
interface A {
    default void foo() {
        System.out.println("A's foo");
    }
}

interface B extends A {
    default void foo() {
        System.out.println("B's foo");
    }
}

interface C extends A {
    default void foo() {
        System.out.println("C's foo");
    }
}

class D implements B, C {
    public void test() {
        foo(); // which implementation of foo() should be called here?
    }
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>


## Q. Can we Overload or Override static methods in java ?

Yes we can overload static methods but we cannot override. 

** static method calls are resolved at compile time. Overriding is a feature of OOP languages like Java that is related to run-time polymorphism.

```java
public class Example {
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String args[])
    {
        Example.foo();
        Example.foo(10);
    }
}
```

<div align="right">
    <b><a href="#table-of-contents">↥ back to top</a></b>
</div>
