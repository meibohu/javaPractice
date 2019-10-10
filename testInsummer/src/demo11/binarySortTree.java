package demo11;

public class binarySortTree {
	Node root;
	
	public binarySortTree() {
		this.root = root;
	}
	
	public void add(Node node) {
		if(root==null) {
			root = node;
		}
		else {
			root.add(node);
		}
	}
	public void middleShow() {
		if(root==null) {
			return;}
		else {
			root.middleShow(root);	
		}
	}
	public Node searchNode(int i) {
		if(root==null) {
			return null ;
		}else {
			return root.searchNode(i);
		}
	}
	public void deleteNode(int value) {
		if(root==null) {
			return;
		}else {
			Node target = root.searchNode(value);
			if(target==null) {
				return;
			}else {                                                 
				Node parent = searchParent(value);                             //the first situation 
				if(target.leftNode==null&&target.rightNode==null) {                        
					if(parent.leftNode.value==value) {
						parent.leftNode = null;
					}
					if(parent.rightNode.value==value) {
						parent.rightNode = null;
					}
				}	 
				else if(target.leftNode!=null&&target.rightNode!=null) {    //the third situation(the most difficult)
					int min = searchMin(target.rightNode);     //find the smallest element in right subtree
					target.value = min;                        //replace
					
				}
				else {
					if(target.leftNode!=null) {                              //the second situation because the condition is complex.
						if(parent.leftNode.value==value) {
							parent.leftNode = target.leftNode;
						}else if(parent.rightNode.value==value) {            //there are two parent conditions.
							parent.rightNode = target.leftNode;
						}
					}
					if(target.rightNode!=null) {
						if(parent.leftNode.value==value) {
							parent.leftNode = target.rightNode;
						}else if(parent.rightNode.value==value) {
							parent.rightNode = target.rightNode;
						}
					}
				}
			}
		}
	}
	
	private int searchMin(Node node) {
		// TODO Auto-generated method stub
		Node target = node;
		while(target.leftNode!=null) {
			target = target.leftNode;
		}
		
		deleteNode(target.value);       //we can use the previous recursion method because we have considered all the situation.	
		return target.value;   //return this value to min.
	}

	public Node searchParent(int value) {             
		if(root==null) {
			return null;
		}else {
			return root.searchParent(value);
		}
	}
}
