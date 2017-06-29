package linkedList;


public class length {
	
	public static int count_length(Node head){
		int len = 0;
		Node x = head;
		while(x != null ){
			x = x.next;
			len++;
		}
		return len;
	}
	
	public static int rec_length(Node head){
		if(head == null){
			return 0;
		}
		return 1 + rec_length(head.next);
	}
	
	public static void main(String args[]){
		
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		System.out.println(count_length(head));
		System.out.println(rec_length(head));
	}
	
	
}
