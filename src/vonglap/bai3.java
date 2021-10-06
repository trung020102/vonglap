package vonglap;

import java.util.Iterator;
import java.util.Scanner;



public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     int num = scanner.nextInt();
     int  sum = 0;
     for(int i = 1; i <= num; ++i)
     {
         // sum = sum + i;
         sum += i;
     }
     System.out.println("Sum = " + sum);
	}

}
