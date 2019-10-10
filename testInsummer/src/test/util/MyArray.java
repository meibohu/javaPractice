package test.util;

import java.util.Arrays;

public class MyArray {
	
		private int elements[];
		
		public MyArray(){
			elements = new int[0];
		}
		//obtaining the length
		//public int size() {
		//	return elements.length;
		//}
		//adding element on the last
		public void add(int element) {
			int newArr[] = new int[elements.length + 1];
			for(int i=0; i<elements.length; i++) {
				newArr[i] = elements[i];
			}
			newArr[elements.length] = element;
			elements = newArr;
		}
		
		public void show() {
			System.out.print(Arrays.toString(elements));
		}
		
		public void delete(int index) {
			if (index < 0 || index > elements.length-1) {
				throw new RuntimeException("goacross");
			}
			else {
				int newArr[] = new int[elements.length - 1];
				for(int i=0;i<newArr.length;i++) {
					if(i<index) {
						newArr[i] = elements[i];
					}
					//moving forward
					else {
						newArr[i] = elements[i+1];
					}
				 }
				
				elements = newArr;		
			}
		}
		
		public int get(int index) {
			return elements[index];
		}

		public void insert(int index,int element)
		{
			int newArr[] = new int[elements.length+1];
			
			for(int i=0;i<elements.length;i++) {
				if(i<index) {
					newArr[i] = elements[i];
				}
				//moving backwards
				else {
					newArr[i+1] = elements[i];
				}
			newArr[index] = element;
			}
			elements = newArr;
		}
		
		public void set(int index,int element)
		{
			elements[index] = element;
		}
		
		//linear search
		public int search(int target) {
			for(int i=0;i<elements.length;i++) {
				if(elements[i] == target){
					//index = i;
					return i;		
				}
			}
			return -1;
		}
		
		//Binary search
		public int binarysearch(int target) {
			int begin = 0,end = elements.length-1; 
			int mid = (begin + end)/2;
			
			while(true) {
				if(begin>=end) {
					return -1;
				}
				
				if(target == elements[mid]) {
					//index = mid;
					//break;
					return mid;
				}
				else if(target > elements[mid]) {
					begin = mid+1;
				}
				else if(target < elements[mid]){
					end = mid-1;
				}
				mid = (begin+end)/2;			
				}
		}
}