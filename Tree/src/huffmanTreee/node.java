package huffmanTreee;
public class node implements Comparable<node>{
	int value;
	node leftNode;
	node rightNode;
	
	public node(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(node o) {
		// TODO Auto-generated method stub
		return -(this.value-o.value);
	}
	@Override
	public String toString() {
		return "node [value=" + value + "]";
	}
	
}
