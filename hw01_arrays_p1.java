package homework;

import java.util.Scanner;

public class hw01_arrays_p1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("HW01 - arrays problem 1 - ricardo hernandez");
		
		
		
		System.out.print("Enter number of elements: ");
		int elements = input.nextInt();
		
		int[] list1 = new int[elements];
		int[] list2 = new int[elements];
		
		System.out.println("Enter numbers for list 1");
		System.out.println("--------------------------------");
		for (int i = 0; i < elements; i ++) {
			System.out.print("enter number " + (i + 1) + ": ");
			list1[i] = input.nextInt();
		}
		
		
		System.out.println("\nEnter numbers for list 2");
		System.out.println("--------------------------------");
		for (int j = 0; j < elements; j ++) {
			System.out.print("enter number " + (j + 1) + ": ");
			list2[j] = input.nextInt();
		}
		
		if (mirror(list1, list2)) {
			System.out.println("two lists are strictly identical");
		}
		else {
			System.out.println("two lists are not strictly identical");
		}
		
	

	}
	
	public static boolean mirror(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length; i ++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}
		return true;
	}

}
