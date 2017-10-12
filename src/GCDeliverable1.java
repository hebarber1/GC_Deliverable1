import java.util.Scanner;

public class GCDeliverable1 {

	public static void main(String[] args) {

int num1 = 0;		//User input first integer
int num2 = 0;		//User input second integer


	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter a 3 digit number");
	num1 = scnr.nextInt(); 	//Reads 1st integer from user input
	int digit1 = num1 / 100;
    int digit2 = (num1 % 100)/10;
    int digit3 = num1 % 10;

	
	System.out.print("Enter another 3 digit number");
	num2 = scnr.nextInt(); 	//Reads 1st integer from user input
	int digit4 = num2 / 100;
    int digit5 = (num2 % 100)/10;
    int digit6 = num2 % 10;
	
	//Add and compare each digit place of the two numbers
	int a = (digit1 + digit4);
	int b = (digit2 + digit5);
	int c = (digit3 + digit6);
	
	if ((a == b) && (b == c)) {
		System.out.print("True");		
	}
	else {
		System.out.print("False");
	}
        
        
	}

}
