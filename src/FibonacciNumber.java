import java.lang.reflect.Array;
import java.util.Scanner;

public class FibonacciNumber {
	
	public static void main(String args[]) {
		
		
		System.out.println("Enter number upto fibonacci series to print");
		//Array<Integer> arr[] = new Array<Integer>(20);

		Scanner a= new Scanner(System.in);
		int b=a.nextInt();
		
		for(int i=1; i<=b; i++) {
			
			if(i==1||i==2) {
				//arr[i]=1;
			}
			
			System.out.println(i+(i-1));
			
		}
		
	}

}
