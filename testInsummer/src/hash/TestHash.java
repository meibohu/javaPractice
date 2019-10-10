package hash;
public class TestHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudInf s1 = new StudInf(16,3);
		StudInf s2 = new StudInf(17,11);
		StudInf s3 = new StudInf(18,23);
		StudInf s4 = new StudInf(19,24);
		StudInf s5 = new StudInf(20,9);
		
		HashTable ht = new HashTable();
		ht.put(s1);
		ht.put(s2);
		ht.put(s3);
		ht.put(s4);
		ht.put(s5);
		
		StudInf target = new StudInf(19,24);
		StudInf inf = ht.get(target);
		System.out.println(target);
		System.out.println(inf);
		
		
		
		
	}

}
