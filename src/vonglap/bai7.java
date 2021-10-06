package vonglap;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int  t1 = 0, t2 = 1;
	        System.out.print("First 10 terms: ");
	        for (int i = 1; i <= 10; ++i)
	        {
	            System.out.print(t1 + "  ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}

}
