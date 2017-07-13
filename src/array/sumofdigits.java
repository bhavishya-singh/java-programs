package array;

public class sumofdigits {
	
	public static int sum(int num){
		int sum = 0;
		while(num>0){
			int sign = num % 10;
			num/=10;
			sum+=sign;
		}
		return sum;
	}
	
	public static void main(String args[]){
		System.out.println(sum(1233));
	}

}
