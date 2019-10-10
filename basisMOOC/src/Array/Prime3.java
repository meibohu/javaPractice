package Array;
public class Prime3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] newArr = new int[50];
			newArr[0]=2;
			int cnt=1;
			Main:
			for(int num=3;cnt<newArr.length;num++) {    //cnt has two meanings.
				
				for(int i=0;i<cnt;i++) { 
					if(num%newArr[i]==0) {
						continue Main;          //continue the outer circulation.
					}
				}
				newArr[cnt++]=num;
			}
			for(int k:newArr) {
				System.out.print(k+" ");
			}
	}
}
