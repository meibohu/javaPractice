package binaryTree;
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTree wendy = new binaryTree();
		treeNode root = new treeNode(1);
		wendy.setRoot(root);
		
		treeNode leftN = new treeNode(2);
		treeNode rightN = new treeNode(3);
		root.setLeftNode(leftN);
		root.setRightNode(rightN);
		
		treeNode leftN1 = new treeNode(4);
		treeNode leftN2 = new treeNode(5);
		leftN.setLeftNode(leftN1);
		leftN.setRightNode(leftN2);
		
		treeNode rightN1 = new treeNode(6);
		treeNode rightN2 = new treeNode(7);
		rightN.setLeftNode(rightN1);
		rightN.setRightNode(rightN2);
		
//		wendy.frontShow();
//		System.out.println(" ");
//		wendy.middleShow();
//		System.out.println(" ");
//		wendy.afterShow();
	
//		System.out.println(" ");
//		treeNode target = wendy.frontSearch(3);
//		System.out.println(target);
//		treeNode target = wendy.middleSearch(2);
//		System.out.println(target.getData());
		
		wendy.delete(2);
		wendy.frontShow();
	}

}
