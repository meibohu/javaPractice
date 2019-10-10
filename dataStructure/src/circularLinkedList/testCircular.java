package circularLinkedList;
public class testCircular {
	public static void main(String[] args) {
		loopNode node1 = new loopNode(2);
		loopNode node2 = new loopNode(4);
		loopNode node3 = new loopNode(6);
		loopNode node4 = new loopNode(8);
		
		node1.afterInsert(node2);
		System.out.println(node1.next().next().getData());
	}
	
}
