// check prime Number using using boolean datatype

package test;

public class t1 {
	public static void main(String[] args) {
		System.out.println("Hi Ganesh !");
		// System.out.println(test(5.556d, 5));
		int n = 9;
		if(prime(n)== true) {
			System.out.println("Prime");
		}
		else System.out.println("Not prime");
	}
  
	public static boolean prime(int n) {
		if(n<1)return false;
		int i = 2, temp = 0;
		boolean isprime = true;
		while(i < n/2) {
			temp = n%i;
			i++;
			if(temp  == 0) {
				isprime = false;
				break;
			}
		}
		if(isprime) return true;
		else return false;	
	}
}
