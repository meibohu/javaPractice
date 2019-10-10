package Circulation;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] newArr = new int[] {2,5,22,52,4,3};
			int sum = 0;
			for(int i=0;i<newArr.length;i++) {
				sum = sum + newArr[i];
			}
			double average = sum/newArr.length;
			System.out.println(average);
	}

}
