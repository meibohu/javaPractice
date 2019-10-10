package tree;

public class treeNode {
	int value;
	treeNode leftNode;
	treeNode rightNode;
	
	public treeNode(int value) {
		this.value = value;
	}
	public void setleftNode(treeNode leftNode) {
		this.leftNode = leftNode;
	}
	public void setrightNode(treeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public void frontShow() {
		System.out.print(value);
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
		System.out.print(value);
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
		System.out.print(value);
	}
	
	public int frontSearch(int bai) {
		int target = 0;
		if(value==bai) {
			return value;
		}
		else {
			if(leftNode!=null) {
				target = leftNode.frontSearch(bai);
			}
			if(target != 0) {
				return target;
			}
			if(rightNode!=null) {
				target = rightNode.frontSearch(bai);
			}}
		return target;
	}
	public treeNode middleSearch(int i) {
		treeNode target = null;
		if(this.leftNode!=null) {
			target = leftNode.middleSearch(i);
		}
		if(target!=null) {
			return target;
		}else {
			if(this.value==i) {
				return this;	
			}
			if(this.rightNode!=null) {
				target = rightNode.middleSearch(i);
			}}
		return target;
	}
	public treeNode afterSearch(int ii) {
		treeNode target = null;
		if(leftNode!=null) {
			target = leftNode.afterSearch(ii);
		}
		if(target!=null) {
			return target;
		}
		else {
			if(rightNode!=null) {
				target = rightNode.afterSearch(ii);
			}
			if(this.value==ii) {
				return this;
			}}
		return target;
	}
}
