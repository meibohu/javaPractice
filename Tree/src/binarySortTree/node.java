package binarySortTree;


public class node {
	int value;
	node leftNode;
	node rightNode;
	
	
	public node(int value) {
		this.value = value;
	}
	public void add(node n) {
		// TODO Auto-generated method stub
		if(n.value<this.value) {
			if(this.leftNode==null) {
				leftNode = n;
			}else {
				leftNode.add(n);
			}		
		}
		if(n.value>this.value) {
			if(this.rightNode==null) {
				rightNode = n;
			}else {
				rightNode.add(n);
			}
		}
	}
	public void middleShow(node n) {
		if(n==null) {
			return;
		}else {
			middleShow(n.leftNode);
			System.out.print(n.value+" ");
			middleShow(n.rightNode);
		}
	}
	
	public node search(int target) {
		if(this.value==target) {
			return this;
		}else {
			if(this.value<target) {
				if(leftNode==null) {
					return null;
				}else {
					leftNode.search(target);
				}
			}
			if(this.value>target) {
				if(rightNode==null) {
					return null;
				}else {
					rightNode.search(target);
				}
			}
		}
		return null;
	}
	public void deleteNode(int target) {
		node target1 = search(target);
		if(target1==null) {
			return;}
		
		node parent = this.searchParent(target);
		if(target1.leftNode==null&&target1.rightNode==null) {
			if(parent.leftNode.value==target) {
				parent.leftNode = null;
			}
			if(parent.rightNode.value==target) {
				parent.rightNode = null;			
			}
		}		
	}
	public node searchParent(int value) {
		// TODO Auto-generated method stub
		
		if((this!=null&&this.leftNode.value==value)||(this!=null&&this.rightNode.value==value)) {
			return this;
		}else {
			if(this.value>value&&this.leftNode!=null) {
				return leftNode.searchParent(value);
			}
			if(this.value<value&&this.rightNode!=null) {
				return rightNode.searchParent(value);
			}
			return null;
		}
	
	}
	@Override
	public String toString() {
		return "node [value=" + value + "]";
	}
	

}
