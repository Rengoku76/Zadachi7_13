package Zadachi7_13;
public class prog1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[50];
		int count = 0;
		
		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
			num[count] = i;
			count+=1;
			}
			}
		for (int i = 0; i < num.length; i++) {
		    System.out.print(num[i] + " ");
		}
		for (int i = num.length-1; i >=0 ; i--) {
		    System.out.print(num[i] + " ");
}
}
}