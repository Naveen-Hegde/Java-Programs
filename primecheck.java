import java.io.*;
import java.util.Scanner;
class NumberNotPrimeException extends Exception{
	int num;
	NumberNotPrimeException(int num){
		this.num=num;
	}
	public String toString() {
		return "The number"+num+" is not a prime number";
	}
}
class NegativeNumberNotAllowedException extends Exception{
	int num;
	NegativeNumberNotAllowedException(int num){
		this.num=num;
	}
	public String toString() {
		return "The number"+num+" is negative!! Please enter a positive number";
	}
}
public class primecheck {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n<1)
		throw new NegativeNumberNotAllowedException(n);
		else
		{
			int count = 0;
			for(int i=1;i<=n;i++) {
				if(n%i==0)
				count++;
			}
			if(count==2)
			System.out.println("The number is a prime number");
			else 
			throw new NumberNotPrimeException(n);
		}
	}

}
