//1
class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.6;
        char c = 'A';
        boolean bool = true;

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c + " (ASCII: " + (int) c + ")");
        System.out.println("Boolean value: " + bool);
    }
}
//2
class IntToDouble {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = intValue; 
        System.out.println("Int value: " + intValue);
        System.out.println("Double value: " + doubleValue);
    }
}
//3
class DoubleToInt {
    public static void main(String[] args) {
        double doubleValue = 42.89;
        int intValue = (int) doubleValue; 
        System.out.println("Double value: " + doubleValue);
        System.out.println("Int value (after typecasting): " + intValue);
        System.out.println("Data Loss: Fractional part (0.89) is lost during conversion.");
    }
}
//4
class AverageCalculator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        double average = (a + b + c) / 3.0; 
        System.out.println("Average (double): " + average);
    }
}
//5
class LiteralsDemo {
    public static void main(String[] args) {
        int binary = 0b1010; 
        int octal = 012; 
        int hex = 0xA; 
        float floatValue = 10.5f; 

        System.out.println("Binary literal: " + binary);
        System.out.println("Octal literal: " + octal);
        System.out.println("Hexadecimal literal: " + hex);
        System.out.println("Floating-point literal: " + floatValue);
    }
}
//6
class CharacterLiterals {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "Hello";

        System.out.println("Character: " + ch + " (ASCII: " + (int) ch + ")");

        System.out.println("String: " + str);
        System.out.print("ASCII values of characters in the string: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print((int) str.charAt(i) + " ");
        }
    }
}

//7
class BooleanDemo {
    public static void main(String[] args) {
        boolean condition = true;

        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
    }
}

//8
class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 20, b = 10;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
//9
class RelationalOperators {
    public static void main(String[] args) {
        int a = 20, b = 10;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}
//10
class LogicalOperators {
    public static void main(String[] args) {
        int number = 8;

        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else {
            System.out.println("The number is not positive and even.");
        }
    }
}
//11
class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Initial value of a: " + a);

        a += b; 
        System.out.println("After += : " + a);

        a -= b; 
        System.out.println("After -= : " + a);

        a *= b; 
        System.out.println("After *= : " + a);

        a /= b; 
        System.out.println("After /= : " + a);

        a %= b; 
        System.out.println("After %= : " + a);
    }
}
// 1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.
// 2. Write a program to convert an int value to double automatically and display both values.
// 3. Write a program to convert a double value to int using typecasting and explain the data loss.
// 4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.
// 5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.
// 6. Write a program to display character and string literals along with their ASCII values.
// 7. Write a program that uses boolean literals to control program flow in an if-else statement.
// 8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
// 8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
// 9. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.
// 10. Write a program to check if a number is positive and even using logical operators (&&, ||, !).
// 11. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.