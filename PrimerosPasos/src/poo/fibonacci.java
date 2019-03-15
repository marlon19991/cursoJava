package poo;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int t;
		int limite=5000;
		
		System.out.println(n1);
		System.out.println(n2);		
		
		while (n2+n1<=limite) {
			n1 = n2;
			t = n1;
			n2=t+n1;
			
			System.out.println(n2);
		}
		
	}

}
