package array;

import java.util.ArrayList;

public class zap {

	public static int count_Zap_Strings(String s)
    {
        int  n = s.length();
       	int  ans = (n * (n+1))/2;
       	int last = -1;
       	boolean first_zap = false;
       	boolean first_nonzap = false;
       	for(int i =0 ;i<n;i++){
       	    char c = s.charAt(i);
       	    if(c == 'z' || c == 'a' || c == 'p'){
       	        if(!first_zap){
       	            if(last != -1){
       	                int minus = ((i - last) * (i - last + 1))/2;
       	                ans -= minus;
       	            }
       	            first_zap = true;
       	            first_nonzap = false;
       	        }else{
       	            
       	        }
       	    }else{
       	        if(!first_nonzap){
       	            last = i;
       	            first_nonzap = true;
       	        }
       	        first_zap = false;
       	    }
       	}
       	if(first_nonzap){
       	    int minus = ((n - last) * (n - last + 1))/2;
       	    ans -= minus;
       	}
       	return ans;
    }
	public static void zen_Number(long N)
	   {
	        ArrayList<Integer> list = new ArrayList<>();
	        while(N>0){
	            list.add((int) (N%10));
	            N/=10;
	        }
	        int last = -1;
	        int i = 1;
	        while(i < list.size()){
	            if(list.get(i) > list.get(i-1)){
	                last = i;
	                list.set(i,list.get(i) -1);
	            }
	            i++;
	        }
	        boolean x = false;
	        i = list.size()-1;
	        while(i >= 0){
	            if(i < last){
	                System.out.print("9");
	            }else{
	                if(!x && list.get(i).equals(0)){
	                    
	                }else{
	                    System.out.print(list.get(i));
	                    x = true;
	                }
	            }
	            i--;
	        }

	    }
	public static void main(String[] args) {
		System.out.println(count_Zap_Strings("abcd"));

	}

}
