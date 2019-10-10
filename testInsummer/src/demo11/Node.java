package demo11;

public class Node {
	int value;
	Node leftNode;
	Node rightNode;
	
	public Node(int value){
		this.value = value;
	}
	
	public void add(Node node) {
		if(node==null) {
			return;
		}
		if(node.value<this.value) {//comparing to current node
			if(this.leftNode==null) {
				this.leftNode = node;	
			}
			else {
				this.leftNode.add(node);    //Recursion
			}}
		else if(node.value>this.value) {
			if(this.rightNode==null) {
				this.rightNode = node;
			}
			else {
				this.rightNode.add(node);
			}
		}				
	}

	public void middleShow(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return;
		}
			middleShow(node.leftNode);
			System.out.println(node.value);
			middleShow(node.rightNode);
		
	}

	public Node searchNode(int i) {
		// TODO Auto-generated method stub
		if(this.value==i) {
			return this;
		}else if(this.value>i) {
			if(leftNode==null){
				return null;
			}
			return this.leftNode.searchNode(i);
			}
		else if(this.value<i) {
			if(rightNode==null) {
				return null;}
			return this.rightNode.searchNode(i); 
			}	
		return null;
	}
	
	public Node searchParent(int value) {
		if((this.value!=0&&this.leftNode.value==value)||(this.value!=0&&this.rightNode.value==value)){
			return this;
		}else {
			if(this.leftNode.value!=0&&this.value>value) {
				return leftNode.searchParent(value);
			}else if(this.rightNode.value!=0&&this.value<value) {
				return rightNode.searchParent(value);
			}
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
