package test;

public class TestSearch {

	public static void main(String[] args) {
		int newArr[] = new int[] {2,3,5,6,2};
		
		int target = 10,index = -1;
		
		for(int i=0;i<newArr.length;i++) {
			if(newArr[i] == target){
				index = i;
				break;		
			}
		}
		System.out.println("index="+index);
	}
}
