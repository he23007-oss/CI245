package homework;
import java.util.Scanner;
public class hw02_work_hours {

	public static void main(String[] args) {
		String[] Names = {"Tom ", "Jane", "Mark"};
		String[] Days = {"Mon", "Tue", "Wed", "Thurs", "Fri"};
		
		double[][] hours = new double[Names.length][Days.length];
		
		System.out.println("CI245 - HW02 - Ricardo Hernandez\n\n");
		
		System.out.println("Work hours entry");
		System.out.println("==========================\n");
		input_hours(hours, Names, Days);
		
		System.out.println("\nDisplay Weekly Work Hours");
		display_hours(hours, Names, Days);
		
		System.out.println("==================================");
		
		System.out.println("Total hours  :  " + total_hours(hours, Names, Days));
		System.out.println("==================================");
		
		System.out.println("\nTotal Hours by Each Employee:");
		System.out.println("==================================");
		
		totalhoursbyemployee(hours, Names, Days);
		
	}
	
	//1
	public static void input_hours(double[][] hours, String[] Names, String[] Days) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < Names.length; i++) {
			System.out.println("Enter work hours for " + Names[i]);
			for (int j = 0; j < Days.length; j++) {
				System.out.print(Days[j] + " : ");
				 hours[i][j] = input.nextInt();
			}
		}
	}
	
	//2
	public static void display_hours(double[][] hours, String[] Names, String[] Days) {
        for (int i = 0; i < Days.length; i ++) {
            System.out.print("        " + Days[i]);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < Names.length; i ++) {
            System.out.printf(Names[i] + "  |");
            for (int j = 0; j < Days.length; j ++) {
                System.out.print("  " + hours[i][j] + "     ");
            }
            System.out.println();
        }
	}
	
	//3
	public static double total_hours(double[][] hours, String[] Names, String[] Days) {
		double total = 0;
	    for (int row = 0; row < hours.length; row ++) {
            for (int col = 0; col < hours[row].length; col ++) {
	                    total += hours[row][col];
            }
	    }
	    return total;

	}
	
	//4
	public static void totalhoursbyemployee(double[][] hours, String[] Names, String[] Days) {
         for (int row = 0; row <Names.length; row ++) {
             double sum = 0;

             for (int col = 0; col < Days.length; col ++) {
                 sum += hours[row][col];
             }

             System.out.println(Names[row] + "| " + sum);
         }
	}

}
