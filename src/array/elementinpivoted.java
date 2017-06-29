package array;

public class elementinpivoted {
	
	
	public static int search(int [] arr, int l , int r, int x){
		if( l > r ){
			return -1;
		}
		int mid = (l + r)/2;
		if(arr[mid] == x){
			return mid;
		}
		if(arr[l] <= arr[mid]){
			if(x >= arr[l] && x <= arr[mid - 1]){
				return search(arr,l,mid-1,x );
			}
			return search(arr,mid +1,r,x);
		}
		if(x >= arr[mid + 1 ] && x <= arr[r]){
			search(arr, mid +1 , r ,x);
		}
		return search(arr,l,mid -1 , x);
	}
	
	
	public static void main(String args []){
		 int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		 int i = search(arr, 0, arr.length-1, 10);
	        if (i != -1) 
	            System.out.println("Index: " + i);
	        else
	            System.out.println("Key not found");
	}

}
