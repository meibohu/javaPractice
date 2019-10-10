package doublyLinkedList;

public class doubleNode {
	private int data;
	private doubleNode pre = this;
	private doubleNode next = this;
	
	public doubleNode(int value) {
		this.data = value;
	}
	public void afterInsert(doubleNode node) {
		doubleNode nextNext = this.next;
		next = node;
		node.pre = this;
		node.next = nextNext;
		nextNext.pre = node;
	}
	public doubleNode next() {
		return next;
	}
	public doubleNode pre() {
		return pre;
	}
	public int getData() {
		return this.data;
	}
	
}
