package demo6;

public class arrayBinaryTree {
	int[] newArr;
	public arrayBinaryTree(int[] newArr) {
		this.newArr = newArr;
	}
	public void frontShow() {
		frontShow(0);
	}
	
	public void frontShow(int index) {
		if(newArr==null||newArr.length==0) {
			return;
		}
		System.out.print(newArr[index]);
		//Recursion
		if(2*index+1<newArr.length) {
			frontShow(2*index+1);
		}
		if(2*index+2<newArr.length) {
			frontShow(2*index+2);
		}
	}
}
