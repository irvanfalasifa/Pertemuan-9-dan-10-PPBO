package controlStatementProject;

import java.util.Scanner;
public class LeapYearCalculator {
	static int Day, Month, Year;
	static Scanner inInt = new Scanner(System.in);
	static String EvenOdd, nameMonth;
	public static void main(String[] args) {
		inputData();
		Day(leapYear());
		
		System.out.println("\n\nMengecek Inputan . . .\n");
		System.out.println("Day: "+ Day);
		System.out.println("Month: "+MonthEvenOdd()+" Month : "+nameMonth);
		System.out.println("Year: "+Year+" And"+((leapYear())?"":" NOT")+" a Leap Year (Tahun Kabisat)");
	}
	
	static void inputData() {
		System.out.println("Select Month");
		System.out.print("[0] January\t[6] July\n"
						 + "[1] February\t[7] August\n"
						 + "[2] March\t[8] September\n"
						 + "[3] April\t[9] October\n"
						 + "[4] May\t\t[10] November\n"
						 + "[5] June\t[11] Desember\n"
						 + "\nInput Month: ");
		Month = inInt.nextInt()+1;
		System.out.print("Input Year : ");
		Year = inInt.nextInt();
	}
	
	static String MonthEvenOdd() {
		return (((Month % 2 == 0) ? "Even (Genap)" : "Odd (Ganjil)"));
	}
	
	static void Day(boolean leapYear) {
		switch(Month)
		{
			case 1:
				Day = 31;
				nameMonth = "January";
				break;
			case 2:
				nameMonth = "February";
				Day = (leapYear) ? 29 : 28;
				break;
			case 3:
				Day = 31;
				nameMonth = "March";
				break;
			case 4:
				Day = 30;
				nameMonth = "April";
				break;
			case 5:
				Day = 31;
				nameMonth = "May";
				break;
			case 6:
				Day = 30;
				nameMonth = "June";
				break;
			case 7:
				Day = 31;
				nameMonth = "July";
				break;
			case 8:
				Day = 31;
				nameMonth = "August";
				break;
			case 9:
				Day = 30;
				nameMonth = "September";
				break;
			case 10:
				Day = 31;
				nameMonth = "October";
				break;
			case 11:
				Day = 30;
				nameMonth = "November";
				break;
			case 12:
				Day = 31;
				nameMonth = "Desember";
				break;
			default:
				System.out.println("Invalid Input of Month");
		}
	}
	
	static boolean leapYear() {
		return ((Year % 4 == 0) && (Year % 100 != 0))? true:false;
	}
}
