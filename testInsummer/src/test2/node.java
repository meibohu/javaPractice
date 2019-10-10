package test2;

public class node {
	int data;
	node next ;
	
	public node(int data0 ) {
		this.data = data0;
	}
	public void append(node node) {
		node currentNode = this;
		while(true) {
			node nextNode = currentNode.next;
			
			if(nextNode == null) {
				break;
			}
			currentNode = nextNode;		
		}
		currentNode.next = node;
	}
	
	public void deleteNext() {
		//getting the nextnext node
		node newnext = next.next;
		//setting the nextnext node as next node
		this.next = newnext;
	}
	
	public void show() {
		node currentNode = this;
		while(true) {
			System.out.println(currentNode.data+" ");
			currentNode = currentNode.next;
			if(currentNode == null) {
				break;
			}
		}
	}
	
	public void after(node node1) {
		node nextNext = next;
		node1.next = nextNext;
		this.next = node1;
	}
	
	public node next() {
		return this.next;
	}
	
	public int getdata() {
		return this.data;
	}
	
	public boolean islast() {
		return next == null;
	}
}
