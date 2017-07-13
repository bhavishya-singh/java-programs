package array;
import java.util.*;
public class allcombination {

	/**
	 * @param args
	 */
	public static void printlist(ArrayList<Integer> list){
		for(int i = 0 ; i < list.size();i++){
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	public static void printsumcombination(ArrayList<Integer> list , Integer sofar, Integer sum){
		if(sofar > sum){
			return;
		}
		if(sofar.equals(sum)){
			printlist(list);
		}
		for(int i = 1; i < sum; i++){
			list.add(i);
			printsumcombination(list,sofar + i, sum);
			list.remove(list.size() - 1);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		printsumcombination(list,0,4);

	}

}
