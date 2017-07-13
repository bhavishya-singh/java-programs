package array;

public class largestsskunigecharacter {
	
	public static String uniquekchar(String str, int k){
		int [] map = new int [256];
		int now = 0;
		int largest = 0;
		int lf = 0;
		int rf = 0;
		int left = 0;
		int right = 0;
		while(right<str.length()){
			char c = str.charAt(right);
			if(map[c] == 0){
				now++;
			}
			map[c]++;
			while(now > k){
				map[str.charAt(left)]--;
				if(map[str.charAt(left)] == 0){
					now--;
				}
				left++;
			}
			if(right-left+1 > largest){
				largest = right-left+1;
				lf = left;
				rf = right;
			}
			right++;
		}
		
		return str.substring(lf,rf+1);
	}
	
	public static void main(String args[]){
		System.out.println(uniquekchar("abbbcccbcbddeeffffabbbcbc",2));;
		
	}

}
