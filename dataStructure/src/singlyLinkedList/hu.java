package singlyLinkedList;
import java.util.Stack;

public class hu {
	public static void main(String[] args) {
		int[][] newArr = new int[][] {{2,4},{3,5}};
		Find(2,newArr);
		
	}
	 public static boolean Find(int target, int [][] array) {
        // boolean temp = false;     
         int i=array.length-1,j=0;
         while(i>=0&&j<array[0].length){	           
	                if(target<array[i][j]){
	                   i--;
	                }
	                else if(target>array[i][j]){
	                   j++; 
	                }
	                else {
	                	 return true;
	                	
	           }
         }
         return false;
         }              

 }
