
//Q2
class LinkedList2{
	static Node head =null;
	 static Node tail=null;
	static class Node{
		int data;
		Node next;
		Node(int d){
		data=d;
		next=null;
		
		}
	}
	static void insert(int newdata){
	Node n=new Node(newdata);
	if(head !=null){
		tail.next=n;
		tail=n;
	
	}
	else{
		head=n;
		tail=head;
	}
	}
	static void display(){
	Node n=head;
	System.out.println("");
	while (n!=null){
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println();
	}
	void reverse(){
		if(head==null || head.next==null)
		return;
		Node prev =null;
		Node current =head;
		Node next =null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev =current;
			current=next;
			
		
		}
		head = prev;
	}
	public static void main(String args[]){
	
	LinkedList2 l1=new LinkedList2();
	//l1.insert(5);
	l1.insert(3);
	l1.insert(4);
	l1.insert(2);
	l1.insert(5);
	l1.display();
	l1.reverse();
	l1.display();
	
	
	}
}