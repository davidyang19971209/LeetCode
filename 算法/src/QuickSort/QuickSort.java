package QuickSort;

public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int high)
	{
		int i,j,temp,t;
		
		if(low>high)
		{
			return;
		}
		
		i = low;
		j = high+1;
		temp = arr[low];
		int v = arr[low];

		while (true) {
            while (++i <= high && arr[i] < v);
            while (--j >= low && arr[j] > v);
            if (i >= j) {
                break;
            }
            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        arr[low] = arr[j];
        arr[j] = v;
		
		
		quickSort(arr,low,j-1);
		quickSort(arr,j+1,high);
	}
	
	 public static void main(String[] args){
	        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
	        quickSort(arr, 0, arr.length-1);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }

}
