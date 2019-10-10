package NoteBook;
import java.util.ArrayList;


public class NoteBook {
	private ArrayList<String> st = new ArrayList<String>();
	
	public void add(String s) {
		st.add(s);
	}
	public void add(int Location,String s) {
		st.add(Location, s);
	}
	public int getSize() {
		return st.size();
	}
	public String getNotes(int index) {
		return st.get(index);   
	}
	public void removeNote(int index) {
		st.remove(index);
	}
	public String[] list() {
		//return new String[10];
		String[] ss = new String[st.size()];
		for(int i=0;i<st.size();i++) {
			ss[i] = st.get(i);
		}
		return ss;
	}
	
	
}
