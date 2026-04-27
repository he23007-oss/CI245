package homework;

public class hw01_arrays_p2 {

	public static void main(String[] args) {
		System.out.println("HW01 - arrays problem 2 - ricardo hernandez");
		
		int[] list = new int[100];

		for (int i = 0; i <list.length; i ++) {
			list[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("Scores ----------------------");
		display(list);
		
		System.out.println("\nAverage Scores: " + averages(list));
		System.out.println("\nabove average scores: " + averages_above(list));
	}
	
	
	public static void display(int[] list) {
		for (int i = 0; i < list.length; i ++) {
			if ( (i + 1) % 10 == 0) {
				System.out.println(list[i] + "  ");
			}
			else {
				System.out.print(list[i] + "  ");
			}
		}
	}

	public static double averages(int[] list) {
		double total = 0;
		
		for (int i = 0; i < list.length; i ++) {
			 total += list[i];
		}
		double average = total / list.length;
		
		
		return average;
	}
	
	public static double averages_above(int[] list) {
		int count = 0;
		for (int i = 0; i < list.length; i ++) {
			 if (list[i] > averages(list)) {
				 count ++;
			 }
		}
		return count;
	}
}
