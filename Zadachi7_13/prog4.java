package Zadachi7_13;

import java.util.Random;

public class prog4 {
    public static void main(String[] args) {
    	int[] num = new int[5];
    	int[] num2 = new int[5];
        Random rand = new Random();
        
        for (int i = 0; i < num.length; i++) {
        	num[i] = rand.nextInt(6);
        	num2[i] = rand.nextInt(6);
        }
		for (int i = 0; i < num.length; i++) {
		System.out.print(num[i]+" ");
		}
		System.out.println();
		for ( int i = 0; i < num2.length; i++) {
			System.out.print(num2[i]+" ");
}
		 System.out.println();
		 double average1 = 0;
		 double average2 = 0;
		    for (int i = 0; i < num.length; i++) {
		      average1 += num[i];
		      average2 += num2[i];
		    }
		    average1 /= num.length;
		    average2 /= num2.length;

		    
		    System.out.println("Среднее арифметическое элементов массива 1: " + average1);
		    System.out.println("Среднее арифметическое элементов массива 2: " + average2);

		    
		    if (average1 > average2) {
		      System.out.println("Среднее арифметическое элементов массива 1 больше, чем у массива 2");
		    } else if (average1 < average2) {
		      System.out.println("Среднее арифметическое элементов массива 2 больше, чем у массива 1");
		    } else {
		      System.out.println("Среднее арифметическое элементов обоих массивов равны");
		    }
		  }
		}