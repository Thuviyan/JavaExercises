public class BubbleSortExample {

	static void bubbleSort(int[] array) {  
        int n = array.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(array[j-1] > array[j]){  
                                 //swap elements  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
	
	public static void main(String[] args) {
		
		int arr[] ={3,60,35,2,45,320,5};  
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

	}

}
