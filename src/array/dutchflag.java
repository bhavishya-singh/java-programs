package array;

public class dutchflag {

	/**
	 * @param args
	 */
	
	public static void seprate(int [] arr){
		int l = 0;
		int m = 0;
		int h = arr.length -1 ;
		while(m <= h){
			if(arr[m] == 0){
				int temp = arr [m];
				arr[m] = arr[l];
				arr[l] = temp;
				l++;
				m++;
			}else if(arr[m] == 1){
				m++;
			}else{
				int temp = arr [m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
			}
		}
		int i = 0;
		while(i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,1,2,0,2,1,1,1,0};
		seprate(arr);

	}

}
