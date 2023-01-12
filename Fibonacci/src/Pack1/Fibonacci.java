package Pack1;

public class Fibonacci {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21 34 55 89
		int num= 10;
		int n1=0;
		int n2=1;
		System.out.print("The fibonacci serise of " + num +" numbers is :" );
		/*for(int i=1; i<=num;i++) {
		System.out.print(n1+"  ");
			int nextnum=n1+n2;
			n1=n2;
			n2=nextnum;
		}*/
		
		int x=0;
		while(x<=num) {
			System.out.print(n1+"  ");
			int nextnum=n1+n2;
			n1=n2;
			n2=nextnum;
			++x;
	    }
		
		

	}

}
