
public class Operators {
	
	public static void main(String args[]){  
		int a=10;  
		int b=50;  
		int c=11;  
		System.out.println(a++<c&&a<b);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a++<c&a<b);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
		System.out.println(1%10);
		}}  