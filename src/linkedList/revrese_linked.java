package linkedList;


public class revrese_linked {

	public static Node reverse_list(Node curr, Node prev){
		
		if(curr == null){
			return null;
		}
		if(curr.next == null){
			curr.next = prev;
			return curr;
		}
		Node next = curr.next;
		curr.next = prev;
		return reverse_list(next,curr);
	}
	public static void print(Node head){
		Node t = head;
		while(t != null){
			System.out.print(t.data);
			t = t.next; 
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		print(head);
		head = reverse_list(head,null);
		print(head);

	}

}
