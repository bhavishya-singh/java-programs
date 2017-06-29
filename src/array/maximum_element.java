package array;

import java.util.*;
public class maximum_element {
	
	public static boolean check(int[] arr ,int x){
		int count = 0;
		for(int i = 0; i< arr.length; i++){
			if(x == arr[i]){
				count++;
			}
		}
		if(count > arr.length/2){
			return true;
		}else{
			return false;
		}
	}
	
	public static int find(int[] arr){
		int x = arr[0];
		int count = 1;
		int i = 1;
		while(i < arr.length){
			if(x == arr[i]){
				count++;
			}else{
				count--;
			}
			if(count == 0){
				x = arr[i];
				count = 1;
			}
			i++;
		}
		return x;
	}
	
	public static void main(String args[]){
		int a[] = new int[]{1, 2, 1, 1, 2};
		int x = find(a);
		System.out.println(x);
		System.out.println(check(a, x));
	}

}
