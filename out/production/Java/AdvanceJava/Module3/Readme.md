
# Java Exception Handling

## Exception Hierarchy

```
Object
    └── Throwable
        ├── Error (Unchecked - Don't handle)
        │   ├── OutOfMemoryError
        │   ├── StackOverflowError
        │   ├── NoClassDefFoundError
        │   └── VirtualMachineError
        └── Exception
            ├── RuntimeException (Unchecked)
            │   ├── NullPointerException
            │   ├── ArrayIndexOutOfBoundsException
            │   ├── ArithmeticException
            │   ├── IllegalArgumentException
            │   ├── ClassCastException
            │   └── NumberFormatException
            └── Checked Exceptions (Must handle)
                ├── IOException
                │   ├── FileNotFoundException
                │   └── EOFException
                ├── SQLException
                ├── ClassNotFoundException
                └── InterruptedException
```

## Exception Types

### 1. **Checked Exceptions**
- Must be handled or declared
- Compile-time checking
- Examples: `IOException`, `SQLException`, `ClassNotFoundException`

### 2. **Unchecked Exceptions**
- Don't need to be handled
- Runtime exceptions
- Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`

### 3. **Errors**
- Serious problems that applications shouldn't try to catch
- Examples: `OutOfMemoryError`, `StackOverflowError`

## Exception Handling Mechanisms

### 1. **try-catch Block**
```java
try {
    // Risky code
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

### 2. **Multiple catch Blocks**
```java
try {
    int[] arr = new int[5];
    int result = 10 / 0;
    System.out.println(arr[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of bounds");
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (Exception e) {
    System.out.println("General exception");
}
```

### 3. **try-catch-finally**
```java
try {
    // Risky code
} catch (Exception e) {
    // Handle exception
} finally {
    // Always executed
}
```

### 4. **try-with-resources (Java 7+)**
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    // Auto-close resources
} catch (IOException e) {
    e.printStackTrace();
}
```

### 5. **throw and throws**
```java
// throw - explicitly throw an exception
throw new IllegalArgumentException("Invalid argument");

// throws - declare exceptions
public void method() throws IOException, SQLException {
    // Method code
}
```

## Key Methods in Throwable Class

- `getMessage()` - Returns detailed message
- `toString()` - Returns string description
- `printStackTrace()` - Prints stack trace
- `getCause()` - Returns cause of exception
- `fillInStackTrace()` - Fills stack trace

## Best Practices

1. **Be specific** - Catch specific exceptions, not general `Exception`
2. **Don't swallow exceptions** - Always handle or rethrow
3. **Use finally** for cleanup code
4. **Create custom exceptions** for business logic
5. **Log exceptions** properly
6. **Don't catch `Error`** types
7. **Use try-with-resources** for AutoCloseable objects

## Common Exceptions

| Exception | Cause | Solution |
|-----------|-------|----------|
| `NullPointerException` | Null reference | Check for null before use |
| `ArrayIndexOutOfBoundsException` | Invalid array index | Validate array bounds |
| `ArithmeticException` | Invalid arithmetic (like / by 0) | Check denominator |
| `NumberFormatException` | Invalid number format | Use proper parsing |
| `ClassCastException` | Invalid type casting | Use `instanceof` check |
| `FileNotFoundException` | File doesn't exist | Check file existence |

## Custom Exception Example

```java
// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Using custom exception
public void validateAge(int age) throws CustomException {
    if (age < 18) {
        throw new CustomException("Age must be 18 or above");
    }
}
```

## Exception Handling Flow

1. **try block** executes
2. **Exception occurs** → JVM looks for matching catch block
3. **catch block** executes (if found)
4. **finally block** always executes
5. **Program continues** or terminates if uncaught
        


