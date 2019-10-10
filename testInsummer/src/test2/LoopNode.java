package test2;

public class LoopNode {
	int data;
	LoopNode next = this;
	
	public LoopNode(int data0 ) {
		this.data = data0;
	}
	
	public void deleteNext() {
		//getting the nextnext node
		LoopNode newnext = next.next;
		//setting the nextnext node as next node
		this.next = newnext;
	}
	
	public void after(LoopNode node1) {
		LoopNode nextNext = next;
		node1.next = nextNext;
		this.next = node1;
	}
	
	public LoopNode next() {
		return this.next;
	}
	
	public int getdata() {
		return this.data;
	}
}
