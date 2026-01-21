package studio1;

import java.util.Scanner;

public class LEAPYEAR {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
	System.out.print("Please enter a year: ");
    int YEAR = scanner.nextInt();
    boolean Yearcriteria = ((YEAR%4 == 0) && (YEAR%100 != 0)) || (YEAR%400 == 0);
    System.out.println(YEAR + " is a leap year: " + Yearcriteria);

}
}

