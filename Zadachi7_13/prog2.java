package Zadachi7_13;

import java.util.Random;

public class prog2 {
    public static void main(String[] args) {
    	int[] num = new int[15];
    	int count = 0;
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
        	num[i] = rand.nextInt(10);
        	if (num[i] % 2 == 0)
        		count+=1;
        }
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
    }
		System.out.println("\nКоличество чётных элементов: "+count);
}
}