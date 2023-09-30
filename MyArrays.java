import java.util.Arrays;

public class MyArrays {
    private int[] array;
    

    public static int[] mirrorArray(int[] arr) {
        int[] result = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
            result[result.length - 1 -i] = arr[i];
        }
        return result;
    
    }
    public static int removeduplicates(int a[])
    {
    	int n = a.length;
    	for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(a[i]==a[j]) {
					a[j]=a[j+1];
				
				}
			}
		}
    	
        return 0;
    
    }
    public static int[] getMissingValues(int[] arr) {
    	int[] result = {1};
    	for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j < arr[arr.length-1]; j++) {
				if(arr[i] == j) break;
				else result[0]=j ;
			}
		}
    	
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2};
        int n = a.length;
        System.out.println(Arrays.toString( mirrorArray(a)));
        
        int[] b = {1,2,4,5};
        System.out.println(Arrays.toString(getMissingValues(b)));
		
		
 
        n = removeduplicates(a);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "remove ");

        }
    	
    
       
        

    

    
}
