package binarySortTree;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] newArr = new int[] {7,3,10,12,5,1,9};
			Tree wendy = new Tree();
			
			for(int value:newArr) {
				wendy.add(new node(value));
			}
			
			wendy.middleShow();
			System.out.println(" ");
//			node n = wendy.search(7);
//			System.out.println(n.toString());
			
			wendy.delete(9);
			wendy.middleShow();
			
//			node parent = wendy.searchParent(9);
//			System.out.println(parent.toString());
	}

}
