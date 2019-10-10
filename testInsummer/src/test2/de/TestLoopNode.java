package test2.de;
import test2.LoopNode;

public class TestLoopNode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LoopNode n1 = new LoopNode(1);
			LoopNode n2 = new LoopNode(2);
			LoopNode n3 = new LoopNode(3);
			LoopNode n4 = new LoopNode(4);
			
			n1.after(n2);
			System.out.println(n1.next().getdata());
			System.out.println(n2.next().getdata());
			
	}

}
