package NoteBook;
import java.util.ArrayList;

class Value{
	private int value;
	public void set(int value) {
		this.value = value;
	}
	public int get() {
		return value;
	}
//	public String toString() {
//		return ""+value;
//	}
}
public class testNoteBook {
	public static void main(String[] args) {
		Value[] vl = new Value[10];
		for(int i=0;i<vl.length;i++) {
			vl[i] = new Value();
			vl[i].set(i);			
		}
		for(Value k:vl) {
			//System.out.println(k.get());
			k.set(0);
		}
		for(Value k:vl) {
			System.out.println(k.get());
		}
		
		System.out.println("===========");
		
		ArrayList<String> dw = new ArrayList<String>();
		dw.add("o");
		dw.add("p");
		for(String k:dw) {
			System.out.println(k);
		}
				 
		
		// TODO Auto-generated method stub
//			NoteBook nb = new NoteBook();
//			nb.add("a");
//			nb.add("b");
//			
//			System.out.println(nb.getSize());
//			
//			nb.add(1,"c");
//			System.out.println(nb.getNotes(1));
//			System.out.println("===========");
//			
//			nb.removeNote(1);
//			System.out.println(nb.getNotes(1));
//			System.out.println("==========="); 
//			
//			String[] a = nb.list();
//			for(String k:a) {
//				System.out.println(k);
//			}
//			int[] aa = new int[10];
//			System.out.println(aa[1]);
//			String[] bb = new String[10];
//			System.out.println(bb[0]);
////			System.out.println(bb[0].length());
////			String s = null;
////			System.out.println(s.length());
//			for(int i=0;i<bb.length;i++) {
//				bb[i] = ""+i;
//			}
//			System.out.println(bb[0].length());
//			System.out.println(bb[2]);		
			
			
	}

}
