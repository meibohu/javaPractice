package binaryTree;

public class binaryTree {
	treeNode root;
	
	public void setRoot(treeNode node) {
		this.root = node;
	}
	
	public void frontShow() {
		root.frontShow();
	}
	public void middleShow() {
		root.middleShow();
	}
	public void afterShow() {
		root.afterShow();
	}
	
	public treeNode frontSearch(int target) {
		return root.frontSearch(target);
	}
	public treeNode middleSearch(int target) {
		return root.middleSearch(target);
	}
	
	public void delete(int target) {
		root.delete(target);
	}
}
