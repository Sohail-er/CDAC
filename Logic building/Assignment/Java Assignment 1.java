import java.util.Scanner;

// Question 1

class print{
	public static void main(String args[]){
		System.out.println("Hello, My name is Sohail Khan");
}
}
// Question 2


class sum{
	public static void main(String args[]){
	int a = 74;
	int b = 36;
	int sum = a+b;
	System.out.println("The sum of two numbers is: "+sum);	
}
}

// Question 3

class divide{
	public static void main(String args[]){
	int a = 50;
	int b = 3;
	int division = a/b;
	System.out.println("Division of two numbers is:"+division);
}
}

// Question 4

class ArithmeticOperations{
	public static void main(String args[]){
	System.out.println(-5 + 8*6);
	System.out.println((55 + 9) % 9);
	System.out.println(20 + -3*5/8);
	System.out.println(5 + 15/3*2 -8%3);
}
}
// Question 5


class MultipyTwoNumbers{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first number");
	int a = sc.nextInt();

	System.out.println("Enter second number");
	int b = sc.nextInt();

	System.out.println("Multiplication of two numbers is:" + a*b);
}
}

// Question 6

class BasicArithmetic{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first number");
	int a = sc.nextInt();

	System.out.println("Enter second number");
	int b = sc.nextInt();

	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
}
}
// Question 7


class MultiplicationTable{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your number:");
	int num = sc.nextInt();

	for (int i=1;i<11;i++){
		System.out.println(num*i);
}

}
}

// Question 8


class SwapTwoNumbers{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first number");
	int a = sc.nextInt();

	System.out.println("Enter second number");
	int b = sc.nextInt();
	
	int temp = a;
	a = b;
	b = temp;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	
}
}
// Question 9


class AreaofCircle{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter radius (r)");
	int r = sc.nextInt();

	System.out.println("Area of a circle is" + (Math.PI * r * r) );
}
}
// Question 10

class OddEven{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your number");
	int num = sc.nextInt();

	if(num %2 ==0){
		System.out.println("It is an even number");
	}else{
		System.out.println("it is a odd number");
	}

}
}
// Question 11
class LargestOfThreeNumbers{
	public static void main(String args[]){
	int a = 12;
	int b = 45;
	int c = 22;

	if(a>=b){
		if (a>=c){
			System.out.println("a is largest:"+a);
		}else{
			System.out.println("c is largest:"+c);
		}
	}else{
		if(b>=c){
			System.out.println("b is largest:"+b);
		}
		else{
			System.out.println("c is largest:"+c);
		}
	}
}
}
// Question 12
class Reverse{
	public static void main(String args[]){
	int num = 12345;
	int rev =0;

	while (num!=0){
	int digit = num % 10;
	rev = rev * 10 + digit;
	num /=10;
	
	}
	System.out.println("reversed number:"+rev);

}
}

// Question 13

class avg{
	public static void main(String args[]){
	int a = 20;
	int b = 40;
 	int c = 60;
 	int avg = (a+b+c) / 3 ;
	System.out.println("Avg:"+avg);

}
}
// Question 14

class Fibonacci{
	public static void main(String args[]){
	int n =10;
	int a = 0, b = 1;

	for (int i=1;i<=n;i++){
		System.out.println(a+ " ");
		int next = a+b;
		a = b;
 		b = next;
}

}
}

// Question 15

class Factorial{
	public static void main(String args[]){
	int n = 5;
	int factorial = 1;

	for (int i=1;i<=n;i++){
		factorial *= i;
}
	System.out.println(factorial);
}
}
// Question 16

class Prime{
	public static void main(String args[]){
	int num = 17;
	boolean isPrime = true;

	if (num <= 1){
		isPrime = false;	
			
	}else{
		for (int i=2;i<=num/2;i++){
			if (num %i ==0){
				isPrime = false;
				break;
			}	

		}
		
	}
	if (isPrime){
		System.out.println("it is a prime number");
	}else{
		System.out.println("it is not a prime number");
	}
	
}
}

// Question 17

class NaturalNumbers{
	public static void main(String args[]){
	int n = 6;
	for (int i=1;i<=n;i++){
		System.out.println(i);

}

}
}

// Question 18


class CelsiusToFahrenheit{
	public static void main(String args[]){
	int tc = 25;
	int tf = (tc * 9/5)+32;
	
	System.out.println("temperature in fahrenheit:" +tf+"\u00B0"+"F");


}
}

// Question 19

class Power{
	public static void main(String args[]){
	int expo = 4;
	int base = 3;
	int result = 1;
	
	for (int i=1;i<=expo;i++){
		result *= base;

}
	System.out.println(result);
}
}

// Question 20

class NumberOfDigits{
	public static void main(String args[]){
	int n = 123456;
	int count = 0;
	while (n !=0){
		n /= 10;
		count++;
}

	System.out.println(count);

}
}

