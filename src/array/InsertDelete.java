package array;

public class InsertDelete {
	
	public static int search(int []array, int item){
		int index = -1;
		for (int i = 0; i< array.length ;i++){
			if(array[i] == item){
				index = i;
				return index;
			}
		}
		return index;
	}
	
	public static int[] insert(int array[] , int item){
		int []copy = new int[array.length  +1];
		for (int i = 0; i< array.length ;i++){
			copy[i] = array[i];
		}
		copy[array.length] = item;
		return copy;
	}
	
	static int deleteElement(int arr[], int key)
    {
        // Find position of element to be 
        // deleted
        int pos = search(arr, key);
      
        if (pos==-1)
        {
            System.out.println("Element not found");
            return arr.length;
        }
      
        // Deleting element
        int i;
        for (i=pos; i < arr.length - 1; i++)
            arr[i] = arr[i+1];
      
        return arr.length-1;
    }
	
	
	public static void main(String args[]){
		int []array_unsorted = {12, 32, 22, 11, 5};
		
	}

}
