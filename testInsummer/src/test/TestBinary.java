package test;

public class TestBinary {
	public static void main(String[] args) {
		int newArr[] = new int[] {1,3,5,7,8,9,10};
		int target = 10,begin = 0,end = newArr.length-1,index = -1;
		int mid = (begin + end)/2;
		
		while(true) {
			if(target == newArr[mid]) {
				index = mid;
				break;
			}
			else if(target > newArr[mid]) {
				begin = mid+1;
			}
			else if(target < newArr[mid]){
				end = mid-1;
			}
			mid = (begin+end)/2;			
			}
		System.out.println("index:"+index);
		}		
}
