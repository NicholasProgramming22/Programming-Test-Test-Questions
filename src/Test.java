import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
public class Test {
	static Scanner kb = new Scanner(System.in);


	public static void main(String[] args) {
		int age;
		String suburb;
		String email;
		int salary;
		int[] customer = createArray();
		
		
		
		System.out.print("Enter age: ");
		age = kb.nextInt();
		age = ageValidation(age);
		System.out.print("Enter suburb: ");
		suburb = kb.next();
		System.out.print("Enter email: ");
		email = kb.next();
		System.out.print("Enter salary: ");
		salary = kb.nextInt();
		salary = salaryValidation(salary);
		System.out.println("");
		fileWrite(customer);
	}
	
	public static int ageValidation(int value) {
		if (value < 20 || value > 30) {
			System.out.println("Incorrect age value, please enter again");
			value = kb.nextInt();
		}
		
		return value;
	}
	
	public static int salaryValidation(int value2) {
		if (value2 < 40000 || value2 > 150000	) {
			System.out.println("Incorrect salary value, please enter again");
			value2 = kb.nextInt();
		}
		
		return value2;
	}
	
	public static int[] createArray () {
		int[] array = new int[100];
		return array;
	}
	public static void fileWrite(int[] array) {
		try {
			PrintWriter file = new PrintWriter ("txtFiles/salaries.txt");
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("Age: " + array[0] + "; Suburb: " + array[1] + "; Email: " + array[2] + "; Salary: " + array[3]);
				
			}
			file.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

}
