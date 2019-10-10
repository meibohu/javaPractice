package circularLinkedList;
public class loopNode {
	private int data;
	private loopNode next = this;
	
	public loopNode(int value) {
		this.data = value;
	}
	public void deleteNext() {
		loopNode nextNext = next.next;
		if(nextNext!=null) {
			next = nextNext;
		}		
	}
	public void afterInsert(loopNode newNode) {
		loopNode nextNext = next;		
		this.next = newNode;	
		newNode.next = nextNext;
	}
	
	public int getData() {
		return this.data;
	}
	public loopNode next() {
		return this.next;
	}
	
}

