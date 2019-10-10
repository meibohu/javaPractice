package demo11;
import demo11.binarySortTree;
import demo11.Node;
public class testBinarySortTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarySortTree bi = new binarySortTree();
		int newArr[] = new int[]{7,3,10,12,5,1,9};
		
		for(int i:newArr) {         //adding all nodes
			bi.add(new Node(i));
		}
		
		//bi.middleShow();
		
		/*Node node = bi.searchNode(12);
		System.out.println(node.value);
		System.out.println("------------");
		
		Node parentNode = bi.searchParent(3);
		System.out.println(parentNode.value);
		System.out.println("------------");
		
		bi.deleteNode(5);
		bi.middleShow();
		System.out.println("------------");
		bi.deleteNode(3);
		bi.middleShow();*/
		
		bi.deleteNode(7);
		bi.middleShow();
		
	}
	

}
