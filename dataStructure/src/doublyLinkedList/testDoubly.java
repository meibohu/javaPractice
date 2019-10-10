package doublyLinkedList;

public class testDoubly {
	public static void main(String[] args) {
		doubleNode node1 = new doubleNode(1);
		doubleNode node2 = new doubleNode(3);
		doubleNode node3 = new doubleNode(5);
		
		node1.afterInsert(node2);
		node2.afterInsert(node3);
		
		
		System.out.println(node1.next().getData());
		System.out.println(node1.pre().getData());
		
		
	}
}
