package cd;
import java.util.ArrayList;
public class Database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();	
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<item> listITEM = new ArrayList<item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);	
//	}
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
	public void add(item it) {
		listITEM.add(it);
	}
	public void list() {
//		for(CD cd:listCD) {
//			cd.print();
//		}
//		for(DVD dvd:listDVD) {
//			dvd.print();
//		}
		for(item k:listITEM) {
			k.print();
		}
	}		
}
