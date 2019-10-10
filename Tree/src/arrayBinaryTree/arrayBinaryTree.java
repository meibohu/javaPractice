package arrayBinaryTree;

public class arrayBinaryTree {
	int[] newArr;
	public arrayBinaryTree(int[] array) {
		this.newArr = array;
	}
	
	public void frontShow(int index) {
		System.out.print(newArr[index]+" ");
		if(2*index+1<newArr.length) {
			frontShow(2*index+1);
		}
		if(2*index+2<newArr.length) {
			frontShow(2*index+2);
		}
	}
	public void frontShow() {
		frontShow(1);                //reload
	}
}
