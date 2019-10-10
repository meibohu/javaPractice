package singlyLinkedList;
public class Node {
	private int data;
	private Node next;
	
	public Node(int value) {
		this.data = value;
	}
	
	public Node append(Node node) {                        
//		this.next = node;
		Node currentNode = this;
		while(true) {
			Node nextNode = currentNode.next;
			if(nextNode==null) {
				break;
			}
			currentNode = nextNode;					//we have found the last node.
		}
		currentNode.next = node;					//then we need to append node to currentNode.
		return node;								//return node for directly appending.
	}
	
	public void deleteNext() {
		Node nextNext = next.next;
		if(nextNext!=null) {
			next = nextNext;
		}		
	}
	
	public void showNodes() {
		Node currentNode = this;
		while(true) {
			System.out.print(currentNode.getData()+" ");			
			if(currentNode.next==null) {
				break;}
			currentNode = currentNode.next;
			}
	}
	
	public void afterInsert(Node newNode) {
		Node nextNext = next;		
		this.next = newNode;	
		newNode.next = nextNext;
	}
	
	public int getCount() {                   //Iterative
		Node currentNode = this;
		int count = 0;
		while(currentNode!=null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
	public int getCountR(Node node){   			//Recursion
		if(node == null) {
			return 0;
		}		
		return 1+getCountR(node.next);
	}
	public int getCountR2() {
		return getCountR(this);
	}
	
	public Node getIndex(int index) {
		Node currentNode = this;
		int count = 0;
		while(count!=index) {
			currentNode = currentNode.next;
			count++;
		}
		return currentNode;
	}
	
	public int getData() {
		return this.data;
	}
	public Node next() {
		return this.next;
	}	
}
