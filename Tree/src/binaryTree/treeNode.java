package binaryTree;

public class treeNode {      //linked list
	int data;
	treeNode leftNode;            
	treeNode rightNode;
	
	public treeNode(int value) {
		this.data = value;
	}
	public void setLeftNode(treeNode node) {
		this.leftNode = node;
	}
	public void setRightNode(treeNode node) {
		this.rightNode = node;	
	}
	
	public void frontShow() {
		System.out.print(data+" ");
		if(leftNode!=null) {
			leftNode.frontShow();
		}
		if(rightNode!=null) {
			rightNode.frontShow();
		}
	}
	public void middleShow() {
		if(leftNode!=null) {
			leftNode.middleShow();
		}
		System.out.print(data+" ");
		if(rightNode!=null) {
			rightNode.middleShow();
		}
	}
	public void afterShow() {
		if(leftNode!=null) {
			leftNode.afterShow();
		}
		if(rightNode!=null) {
			rightNode.afterShow();
		}
		System.out.print(data+" ");
	}
	
	public treeNode frontSearch(int target) {
		treeNode temp = null;
		if(this.data==target) {
			temp = this;
		}else {
		if(leftNode!=null) {
			temp = leftNode.frontSearch(target);}
		if(temp!=null) {
			return temp;}
		if(rightNode!=null) {
			temp = rightNode.frontSearch(target);}
		}
		return temp;
	}
	
	public treeNode middleSearch(int target) {
		treeNode temp = null;
		if(leftNode!=null) {
			temp = leftNode.middleSearch(target);
		}
		if(temp!=null) {
			return temp;
		}else {
			if(data==target) {
				return this;
			}
			if(rightNode!=null) {
				temp = rightNode.middleSearch(target);	}
		}
		return temp;
	}
	
	public void delete(int target) {
		//treeNode parent = this;
		if(leftNode!=null&&leftNode.data==target) {
			leftNode=null;
			return;
		}
		if(rightNode!=null&&rightNode.data==target) {
			rightNode=null;
			return;
		}else {
			//parent = leftNode;
			if(leftNode!=null) {
				leftNode.delete(target);
			}
			if(rightNode!=null) {
				rightNode.delete(target);
			}
		}		
	}
	public int getData() {
		return this.data;
	}
}
