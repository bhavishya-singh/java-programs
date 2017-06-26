package package_1;
import java.util.*;
class Node{
	Integer index;
	Integer height;
	public Node(Integer index, Integer height){
		this.height = height;
		this.index = index;
	}
}
public class maximum_area_histogram {
	public static void main(String args []){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(6);
		System.out.println(maximum_area(list));
		
	}
	public static Integer maximum_area(ArrayList<Integer> hist){
		Stack<Node> stack = new Stack<>();
		Integer maximum_area = 0;
		hist.get(0);
		for(int  i= 0; i< hist.size(); ){
			if(stack.empty() || stack.peek().height <= hist.get(i)){
				stack.push(new Node(i,hist.get(i)));
				i++;
			}else{
				Node top = stack.peek();
				stack.pop();
				Integer area = top.height * (stack.empty()? i:i - stack.peek().index -1);
				if(area > maximum_area){
					maximum_area = area;
				}
			}
		}
		int  i = hist.size();
		while(!stack.empty()){
			Node top = stack.peek();
			stack.pop();
			Integer area = top.height * (stack.empty()? i:i - stack.peek().index -1);
			if(area > maximum_area){
				maximum_area = area;
			}
		}
		return maximum_area;
	}
}
