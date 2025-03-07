
import java.util.*;

//Q1

class swap{
	public static void main (String[] args){
	int a = 10, b = 20;
	
	a = a ^ b;  // this will get xor of a and b and value stored in a
	b = a ^ b; // when we take xor again with b, b will get cancel and a will be assigend to b
	a = a ^ b; // when we take xor again with a, a will get cancel and b will be assigend to a
	
	System.out.println("a: "+a+"\nb: "+b);
	}
	}
	
//Q2

//if LSB is 0 then it is even and 1 it is odd, '&' is used to fetch LSB
class EvenOdd{
	public static void main (String[] args){
	int n = 6;
	String result = (n & 1 ) == 0 ? n+" is even":n+" is odd";
	System.out.println(result);
	}
	}
	
//Q3

class sumOfDigits{
	public static void main (String[] args){
    int n = 123456;
	int sum = 0;
	
	while (n>0){
		sum+= n%10;
		n/=10;
	}
	System.out.println("Sum of Digits:"+sum);
	}
	}

//Q4
/* take right shift in 2^2,2^3,.... closest to divisor
	now right shift by that power 
	multiple by divisor(3) to get closest multiple of 3
	now find the diff with n 
	if number 3(divisor) or 0 it is divisible
	iterate loop until the number is less than the divisor(3)
*/
class divisibleByThree{
	public static void main (String[] args){
    int n = 27;
	
	while (n>3){
		n = n - (n>>2)*3;
	}
	boolean res = (n==0 || n==3)? true:false;
	System.out.println(res);
	}
	}
	
//Q5
/*a += b: a now holds the sum of a and b.
b = a - b: Subtracting b from the sum gives the original a, which is now stored in b.
a -= b: Subtracting b (original a) from the sum gives the original b.
*/
class swap2{
	public static void main (String[] args){
    int a = 10, b = 20;
	
	a += b; // 10 + 20 =30
	b = a - b; // 30-20 , b=10
	a -= b; // 30-10, a=20
	
	System.out.println("a: "+a+"\nb: "+b);
	}
	}
	
//Q6

class largestOfThree{
	public static void main (String[] args){
    int a = 10, b = 20,c= 5;
	
	String res = (a>b)? (a>c? "a is largest":"c is largest"):(b>c? "b is largest":"c is largest");
	
	System.out.println(res);
	}
	}
	
//Q7

class leap{
	public static void main (String[] args){
    int year = 2000;
	
	if ((year %4 ==0 && year %100 ==0 ) || (year %400 == 0)){
		System.out.println("leap year");
		
	}else{
		System.out.println("not a leap year");
	}
	}
	}

//Q8

class booleanIp{
	public static void main (String[] args){
    boolean a=true,b=true, c=false;
	
	boolean res = (a && b) || (a && c) || (b && c);
	System.out.println(res);
	}
	}

//Q9

class range{
	public static void main (String[] args){
    int n = 35;
	
	boolean res = (n>=20 && n<=50)?true:false;
	System.out.println(res);
	}
}
	
//Q10

class vowelOrConsonant{
	public static void main (String[] args){
    char ch = 'A';
	
	String res = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
				 ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )?"vowel":"consonant";
				 
	System.out.println(res);
	}
}

//Q11
/*Agar koi number power of 2 hai, toh uske binary format mein sirf ek 1 hota hai, 
aur baaki sab 0 hote hain.
(n & (n - 1)):Jab hum ek number me se 1 minus karte hain, toh uska rightmost 1 bit 0 
ban jata hai aur uske baad ke saare bits 1 ho jaate hain
(&) operation between n aur (n - 1) ka result sirf tabhi 0 aata hai jab n power of 2 ho
*/
class powerOfTwo{
	public static void main (String[] args){
		int n =8;
		String res = (n>0 && (n&(n-1))==0)? n+" is power of 2":n+" is not a power of 2";
		System.out.println(res);
	}
}

	
//Q12

/*Left shift << har bit ko left shift karta hai, jo number ko powers of 2 se multiply karta hai.
num << 3 ka matlab num * 2^3 = num * 8.
Example: 5  → 5 << 3 = 40
*/

class MultiplyBy8{
	public static void main (String[] args){
		int n =5;
		int res = (n<<3);
		System.out.println(res);

	}
}

//Q13
/*num >> 31 sign bit ko nikalta hai: 0 for positive aur -1 for negative numbers.

*/
class absolute{
	public static void main (String[] args){
		int n =-5;
		int mask = (n>>31);
		int res = (n+mask)^mask;
		System.out.println(res);

	}
}

//Q14
/*n &= (n - 1); // Remove the last set bit and (& takes only 1 (set bit))
count ++ adds the bit in count
1 is a set bit
*/
class countSetBits{
	public static void main (String[] args){
		int n = 29;
		int count = 0;
        while (n > 0) {
            n &= (n - 1); 
            count++;
        }
        System.out.println(count);

	}
}
//Q15
/*0xAAAAAAAA ek hexadecimal mask hai jisme even positions pe 1 hain
0x55555555 ek hexadecimal mask hai jisme odd positions pe 1 hain
evenBits >> 1: Even bits ko ek position right shift karke odd positions pe le jate hain.
oddBits << 1: Odd bits ko ek position left shift karke even positions pe le jate hain.
*/
class swapOddEvenBits{
	public static void main (String[] args){
		int x = 23;
		int evenBits = x & 0xAAAAAAAA; 
        int oddBits = x & 0x55555555;  
        int res = (evenBits >> 1) | (oddBits << 1);
        System.out.println(res);
       

	}
}

//16

class pnz{
	public static void main (String[] args){
		int n = -5;
		String res = (n>0)?"postive":(n<0)?"negative":"zero";
		System.out.println(res);

	}
}
//17

class min{
	public static void main (String[] args){
		int a = 10,b=4,c=5,d=12;
		
		int res = (a<b)?((a<c)?((a<d)?a:d):((c<d)?c:d)):((b<c)?((b<d)?b:d):((c<d)?c:d));
		System.out.println(res);

	}
}
//18
class passFail{
	public static void main (String[] args){
		int percentage = 83;
		
		String res = (percentage >=40)?"pass":"fail";
		
		
		System.out.println(res);

	}
}

//19
class upperLower{
	public static void main (String[] args){
		char ch = 'S';
		
		String res = (ch>='A' && ch<='Z')?"uppercase":(ch>='a' && ch<='z')?"lowercase":"not a letter";
		
		
		System.out.println(res);

	}
}

//20
class absoluteTernary{
	public static void main (String[] args){
		int n = -7;
		
		int res = (n<0)?-n:n;
		
		
		System.out.println(res);

	}
}
//21
class Increment{
	public static void main (String[] args){
		int n = 7;
		
		int res = -~n;
		
		
		System.out.println(res);

	}
}
//22
class calci{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no 1");
		int a = sc.nextInt();
		System.out.println("enter no 2");
		int b = sc.nextInt();
		System.out.println("enter operator");
		char op = sc.next().charAt(0);
		double res;
		
		switch (op){
			case '+':res = a + b;break;
			case '-':res = a - b;break;
			case '*':res = a * b;break;
			case '/':res = (b!=0)?a / b:Double.NaN;break;
			default :res = Double.NaN;
			
		}
		System.out.println(res);
		

	}
}
//23
class OddEvenBitwise{
	public static void main (String[] args){
		int n = 7;
		
		String res = (n&1)==0?"even":"odd";
		
		
		System.out.println(res);

	}
}
//24
class Even1to100{
	public static void main (String[] args){
		
		
		for(int i=1; i<=100;i++){
			if((i&1)==0){
				System.out.println(i);
			}
		}
		
		

	}
}
//25 
class reverse2{
	public static void main (String[] args){
		int n = 12345;
		int rev = 0;
		while(n>0){
			int digit = n%10;
			rev= rev*10 + digit;
			n/=10;
		}
		
		
		System.out.println(rev);

	}
}