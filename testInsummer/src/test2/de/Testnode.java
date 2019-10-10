package test2.de;
import test2.node;

public class Testnode {
	public static void main(String[] args) {
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		
		n1.append(n2);
		n1.append(n3);
		n3.append(n4);
		//System.out.println(n2.next().next().getdata());
		
		//n1.show();
		//n1.next().deleteNext();
		//n1.show();
		
		node node1 = new node(5);
		n1.next().after(node1);
		n1.show();
	}

}