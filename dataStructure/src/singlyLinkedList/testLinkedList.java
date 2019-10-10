package singlyLinkedList;
public class testLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(2);
		Node node2 = new Node(4);
		Node node3 = new Node(6);
		Node node4 = new Node(8);
		
		node1.append(node2).append(node3);
//		node2.append(node3);
//		node3.append(node4);
//		node1.append(node4);
		node1.append(node4).append(new Node(19));
		
		System.out.println(node1.next().getData());
		System.out.println(node3.next().next().getData());
		
//		node2.deleteNext();
//		System.out.println(node2.next().getData());
		
		node1.showNodes();
		System.out.println(" ");
		node1.afterInsert(new Node(23));
//		System.out.println(node1.next().getData());
		System.out.println("----------");
		int count = node1.getCount();
		System.out.println(count);
		
//		System.out.println(node1.getIndex(4).getData());
		
		int length = node1.getCountR2();
		System.out.println(length);
		
		
		
		
	}

	

	
}
