package Zadachi7_13;

import java.util.Random;

public class prog3 {
    public static void main(String[] args) {
    	int[] num = new int[8];
        Random rand = new Random();
        
        for (int i = 0; i < num.length; i++) {
        	num[i] = rand.nextInt(10) + 1;
        	
        }
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		 System.out.println();
		 for (int i = 1; i < num.length; i += 2) {
		      num[i] = 0;
		    }
		for ( int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
}
		 System.out.println();
}
}