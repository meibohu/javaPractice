package Array;

public class Prime4 {
	public static void main(String[] args) {
		boolean[] newArr = new boolean[50];    
		for(int i=0;i<newArr.length;i++) {             //initialization
			newArr[i]=true;
		}
		for(int i=2;i<newArr.length;i++) {                      //multiple times
			if(newArr[i]) {
				for(int j=2;j*i<newArr.length;j++) {  
					newArr[j*i]=false;
				}
			}
		}
		
		for(int i=2;i<newArr.length;i++) {                  
			if(newArr[i]) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
	
	}
}
