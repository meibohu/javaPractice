package OOArray;
import java.util.Arrays;
import javax.management.RuntimeErrorException;

public class MyArray {
	private int[] elements;
	
	public MyArray() {
		elements = new int[0];
	}
	
	public void addEle(int element) {
		int[] newArr = new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	public int size() {
		return elements.length;
	}

	@Override
	public String toString() {
		return "[elements=" + Arrays.toString(elements) + "]";
	}
//	public void show() {
//		System.out.println(Arrays.toString(elements));
//	}
	
	public void delete(int index) {
		
		if(index<0||index>elements.length) {
			throw new RuntimeException("null");
		}else {	
			int[] newArr = new int[elements.length-1];
			for(int i=0;i<elements.length;i++) {
				if(i<index) {
					newArr[i] = elements[i];
				}else if(i>index) {
					newArr[i-1]=elements[i];
				}
			}
			elements = newArr;
		}	
	}
	public void getEle(int index) {
		System.out.println(elements[index]);
	}
	public void insert(int index,int element) {
		if(index<0||index>elements.length)
			throw new RuntimeException("null");
		else {
			int[] newArr = new int[elements.length+1];
			for(int i=0;i<elements.length;i++) {
				newArr[index] = element;
				if(i<index)
					newArr[i] = elements[i];
				else 
					newArr[i+1] = elements[i];
				
			}
			elements = newArr;
		}
	}
	
	public void replace(int index,int element) {
		elements[index] = element;
	}
	
	public int binarySearch(int target) {
		int begin = 0;
		int end = elements.length-1;
		int mid = (begin+end)/2;
//		int index = -1;
		while(true) {
			if(begin>=end) {
				return -1;
			}
			if(elements[mid]==target) {
//				index = mid;
//				break;
				return mid;
			}
			else if(elements[mid]>target) {
				end = mid-1;
			}else {
				begin = mid+1; 
			}
			mid = (begin+mid)/2;
			}
//		System.out.println(index);
	}			
}


