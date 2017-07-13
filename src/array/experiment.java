package array;
import java.util.*;

public class experiment {

	public static void change(ArrayList<Integer> a, ArrayList<Integer> b){
		a.add(3);
		ArrayList<Integer> temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		change(a,b);
		System.out.println();
	}

}
