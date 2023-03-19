package Zadachi7_13;

import java.util.Random;

public class prog5 {
	    public static void main(String[] args) {
	    	int[] num = new int[4];
	        Random rand = new Random();
	        
	        for (int i = 0; i < num.length; i++) {
	        	num[i] = rand.nextInt(90)+10;
	        }
	        
	        for (int i = 0; i < num.length; i++) {
	            System.out.print(num[i] + " ");
	        }
	        System.out.println();
	        boolean increase = true;
			for (int i = 0; i < num.length - 1; i++) {
				if (num[i] >= num[i + 1]) {
					increase = false;
	                break;
	                }
				}
			
	    if (increase) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
}
}