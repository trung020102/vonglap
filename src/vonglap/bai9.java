package vonglap;

import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    
		    int num1,num2, reversed = 0;
		    System.out.println("\n\nNhập vào số cần đảo ngược: ");
		    num1 = sc.nextInt();
		    num2 = num1;
		    while(num1 != 0) {
		      int digit = num1 % 10;
		      reversed = reversed * 10 + digit;
		      num1 /= 10;
		    }
		    System.out.printf("Số %d sau khi đảo ngược là: %d", num2, reversed);
	}

}
