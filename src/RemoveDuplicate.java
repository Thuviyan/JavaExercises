
public class RemoveDuplicate {
	
	public static void main(String args[]) {
		
		int arr[] = {12,32,34,12,10, 34,32,23,12};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n");
		
		for(int j=0; j<arr.length; j++)
		{
			int temp = arr[j];
			int count=0;
			for(int i=0; i<arr.length; i++)
			{
			if(arr[i] == temp ) {
				count++;
			}}
			System.out.println(arr[j] +" is "+ count+" time printed");
//			if(count>=1) {
//				System.out.print(arr[j] + " ");
//			}
		}
		
	}

}
