package tree;
import tree.binaryTree;
public class binaryTreeTest {

	public static void main(String[] args) {
		binaryTree wendy = new binaryTree();
		treeNode root0 = new treeNode(1);
		wendy.setRoot(root0);
		
		treeNode leftNode1 = new treeNode(2);
		root0.setleftNode(leftNode1);
		
		treeNode rightNode1 = new treeNode(3);
		root0.setrightNode(rightNode1);
		
		treeNode leftNode2 = new treeNode(4);
		leftNode1.setleftNode(leftNode2);
		
		treeNode rightNode2 = new treeNode(5);
		leftNode1.setrightNode(rightNode2);
		
		treeNode leftNode3 = new treeNode(6);
		rightNode1.setleftNode(leftNode3);
		
		treeNode rightNode3 = new treeNode(7);
		rightNode1.setrightNode(rightNode3);
		
		wendy.frontShow();
		System.out.println(" ");
		wendy.middleShow();
		System.out.println(" ");
		wendy.afterShow();		
		System.out.println(" ");
		
		int tt = wendy.frontSearch(3);
		System.out.println(tt);
		
		treeNode ff = wendy.middleSearch(4);
		System.out.println(ff);
		
		treeNode gg = wendy.middleSearch(56);
		System.out.println(gg);
	}

}
