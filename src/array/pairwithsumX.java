package array;
import java.util.*;

class Pair{
	int a;
	int b;
	public Pair(int a , int b){
		this.a = a;
		this.b = b;
	}
}
public class pairwithsumX {
	
	public static Pair iterative_method (int [] arr, int x){
		Arrays.sort(arr);
//		System.out.println(arr[0]);
		int l = 0;
		int r = arr.length - 1;
		while(l <= r){
			if(arr[l] + arr[r] == x){
				return new Pair(arr[l], arr[r]);
			}else if(arr[l] + arr[r] < x){
				l++;
			}else{
				r--;
			}
		}
		return null;
	}
	
	
	public static Pair using_maps(int [] arr, int x){
		HashMap<Integer,Integer> map = new HashMap<>();
		int i = 0;
		while(i < arr.length){
			if(map.containsKey(x - arr[i])){
				return new Pair(arr[i], x- arr[i]);
			}else{
				if(map.get(arr[i]) != null)
					map.put(arr[i],map.get(arr[i]) + 1);
				else
					map.put(arr[i], 1);
			}
			i++;
		}
		return null;
	}
	
	public static void main( String  [] args ){
		int A[] = {1, 4, 45, 6, 10, -8};
		System.out.println(iterative_method(A,16).a);
		System.out.println(using_maps(A,16).a);
	}

}
