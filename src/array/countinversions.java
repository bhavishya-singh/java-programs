package array;

public class countinversions {
	
	public static int count(int [ ] arr){
		int temp[] = new int [arr.length];
		return mergesort(arr,temp,0,arr.length-1);
	}
	
	public static int mergesort(int arr[],int temp[], int l, int r){
		int inv = 0;
		if(r > l)
		{
		int  mid = (l + r)/2;
		inv = mergesort(arr,temp,l,mid);
		inv += mergesort(arr,temp,mid+1,r);
		
		inv += merge(arr,temp,l,mid+1,r);
		}
		return inv;
	}
	
	public static int merge(int [] arr,int temp[], int l, int mid, int r){
		int inv = 0;
		int a = l;
		int b = mid;
		int k = l; 
		while(a < mid && b <= r){
			if(arr[a] < arr[b]){
				temp[k++] = arr[a++];
			}else{
				temp[k++] = arr[b++];
				inv += (mid - a);
			}
		}
		
		while(a < mid){
			temp[k++] = arr[a++];
		}
		while(b <= r){
			temp[k++] = arr[b++];
		}
		for(int i = l ; i <= r; i++){
			arr[i] = temp[i];
		}
		return inv;
	}
	public static void main(String args[]){
		int [] arr = {1, 20, 6, 4, 5};
		System.out.println(count(arr));
	}
}
