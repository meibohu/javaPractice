package binarySortTree;

public class Tree {
		node root;	
		
		public void add(node n) {
			if(root==null) {
				root=n;
			}else {
				root.add(n);
			}
		}

		public void middleShow() {
			root.middleShow(root);
		}
		
		public node search(int target) {
			if(root==null) {
				return null;
			}else {
				return root.search(target);
			}
		}
		public void delete(int target) {
			root.deleteNode(target);
		}
		public node searchParent(int target) {
			return root.searchParent(target);
		}
		
}
