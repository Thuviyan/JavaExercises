
public class Triangle {

	public static void main(String[] args) {
		
		for(int j=1; j<=5; j++) {
		for(int i=1; i<=5; i++) {
			
			if(i==1)
			System.out.print(i + " ");
			
			if(i==2 && j>1)
			System.out.print(i + " ");
			
			if(i==3 && j>2)
			System.out.print(i + " ");
			
			if(i==4 && j>3)
			System.out.print(i + " ");
			
			if(i==5 && j>4)
			System.out.print(i + " ");
			
		}
		System.out.println();
		}

	}

}
