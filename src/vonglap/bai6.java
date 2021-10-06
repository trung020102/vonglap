package vonglap;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		       
		        int num =0;
		        String  primeNumbers = "";
		        System.out.print("Nhập vào số n: ");
		        int n = scanner.nextInt();
		        System.out.print("Nhập vào số m: ");
		        int m = scanner.nextInt();
		        scanner.close();
		        for (int i = n; i <= m; i++)
		        {
		            int counter=0;
		            for(num =i; num>=1; num--)
		            {
		                if(i%num==0)
		                {
		                    counter = counter + 1;
		                }
		            }
		            if (counter ==2)
		            {
		                primeNumbers = primeNumbers + i + " ";
		            }
		        }
		        System.out.println("Các số nguyên tố từ " +n + " đến "+ m +" là:");
		        System.out.println(primeNumbers);
	}

}
