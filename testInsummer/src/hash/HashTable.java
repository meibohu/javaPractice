package hash;

public class HashTable {
	private StudInf[] database = new StudInf[100];
	
	public void put(StudInf studinf) {
		int index = studinf.HashTable();
		database[index] = studinf;
	}
	
	public StudInf get(StudInf studinf) {
		return database[studinf.HashTable()];
	}
	
	
	
}
