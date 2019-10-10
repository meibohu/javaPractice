package test2;

public class MyStark {
	int elements[];
	
	public MyStark() {
	    elements = new int[0];
	}
	
	public void push(int element) {
		int newArr[] = new int[elements.length + 1];
		for(int i=0; i<elements.length; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	//obtaining the last one
	public int pop() {
		if(elements.length == 0) {
			throw new RuntimeException("stack is empty");
		}
		
		int element = elements[elements.length-1];
		int newArr[] = new int[elements.length-1];
		for(int i=0;i<newArr.length;i++) {
			newArr[i] = elements[i];
		}
		elements = newArr;		
		return element;
	}	
	//taking element
	public int peek() {
		return elements[elements.length-1];
	}
}
