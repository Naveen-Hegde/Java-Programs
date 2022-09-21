import java.io.*;
public class exceptiondemo {

	public static void main(String[] args){
		try {
			int a=10;
			int b=a/0;
			
		}catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		
        try {

    		String s1=null;
    		System.out.println(s1.charAt(2));
    		
        }catch(NullPointerException e2) {
        	System.out.println(e2);
        }
        
        try {
        	int arr[] = new int[4];
        	System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException e3) {
        	System.out.println(e3);
        }
        
        finally {
        	System.out.println("Inside finally block");
        }
  }
}
