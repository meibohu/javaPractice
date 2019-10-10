package tree;

public class binaryTree {
	treeNode root;
	
	public void setRoot(treeNode root) {
		this.root = root;
	}
	//public treeNode getRoot() {
	//	return root;
	//}
	
	public void frontShow() {
		root.frontShow();
	}
	public void middleShow() {
		root.middleShow();
	}
	public void afterShow(){
		root.afterShow();
	}
	
	public int frontSearch(int bai) {
		return root.frontSearch(bai);
	}
	public treeNode middleSearch(int i) {
		return root.middleSearch(i);
	}
	public treeNode afterSearch(int ii) {
		return root.afterSearch(ii);
	}
}
