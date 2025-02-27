import java.util.Scanner;
// Question 1
class GradeClassification{
	public static void main(String args[]){
	int score = 85;
	

	if(score>=90){
		System.out.println("Grade A");
	}
	else if(score>=80 && score<=89 ){
		System.out.println("Grade B");
	}
	else if(score>=70 && score<=79 ){
		System.out.println("Grade C");
	}
	else if(score>=60 && score<=69 ){
		System.out.println("Grade D");
	}
	else if(score<60){
		System.out.println("Grade F");
	}
	else {
		System.out.println("Invalid");
	}

}
}
// Question 2

class DaysOfWeek {
    public static void main(String args[]) {
        int day =3;

        switch (day) {
            case 1:
                System.out.println("Weekday - Monday");
                break;
            case 2:
                System.out.println("Weekday - Tuesday");
                break;
            case 3:
                System.out.println("Weekday - Wednesday");
                break;
            case 4:
                System.out.println("Weekday - Thursday");
                break;
            case 5:
                System.out.println("Weekday - Friday");
                break;
            case 6:
                System.out.println("Weekend - Saturday");
                break;
	    case 7:
                System.out.println("Weekend - Sunday");
                break;
            default:
                System.out.println("Invalid inpu");
        }


    }
}



// Question 3


class SimpleCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

       
    }
}

// Question 4

class DiscountCalculation{
	public static void main(String args[]){
	int TotalPurchase = 900;
	
	
	double discount = 0;
	
	
	if(TotalPurchase>=1000){
		discount = 0.20 * TotalPurchase;
		double discountAmount = TotalPurchase - discount;
		System.out.println("20% discount:" +discountAmount);
	}
	else if(TotalPurchase>=500 && TotalPurchase<=999){
		discount = 0.10 * TotalPurchase;
		double discountAmount = TotalPurchase - discount;
		System.out.println("10% discount:"+discountAmount);
	}
	else if(TotalPurchase<500 ){
		discount = 0.5 * TotalPurchase;
		double discountAmount = TotalPurchase - discount;
		System.out.println("5% discount:"+discountAmount);
	}else {
		System.out.println("Invalid");
	}

}
}


// Question 5

class PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subject1, subject2, subject3;

        System.out.print("Enter the marks for Subject 1: ");
        subject1 = scanner.nextInt();

        System.out.print("Enter the marks for Subject 2: ");
        subject2 = scanner.nextInt();

        System.out.print("Enter the marks for Subject 3: ");
        subject3 = scanner.nextInt();

        int failedSubjects = 0;

        if (subject1 <= 40) {
            failedSubjects++;
        }
        if (subject2 <= 40) {
            failedSubjects++;
        }
        if (subject3 <= 40) {
            failedSubjects++;
        }

        if (failedSubjects == 0) {
            System.out.println("Congratulations! You passed all subjects.");
        } else {
            System.out.println("You failed in " + failedSubjects + " subject");
        }

    }
}
