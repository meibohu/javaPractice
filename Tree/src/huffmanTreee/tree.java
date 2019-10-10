package huffmanTreee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class tree {
	int[] newArr;
	
	public void createTree(int[] newArr) {
		// TODO Auto-generated method stub
		ArrayList<node> kk = new ArrayList<node>();
		for(int value:newArr) {
			kk.add(new node(value));
		}
		while(kk.size()>1) {
			Collections.sort(kk);
			node leftNode = kk.get(kk.size()-1);
			node rightNode = kk.get(kk.size()-2);
			node parentNode = new node(leftNode.value+rightNode.value);
			kk.remove(rightNode);
			kk.remove(leftNode);
			kk.add(parentNode);					
		}
		System.out.println(kk.toString());
		
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));
		
	}
	

}
