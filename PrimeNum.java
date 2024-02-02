package ds;
import java.util.*;

public class Prime_num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to find prime numbers : "); 
		int p = scanner.nextInt();
		Vector<Integer> primes = new Vector<Integer>();
		int num = 2;
		boolean isPrime;
		while (primes.size() < p)
		{ isPrime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) { if (num % i == 0) {
		isPrime = false;
		break;
		}
		}
		if (isPrime) {
	    primes.add(num);
		 }
		num++; 
		}
		System.out.println("1st " + p + "  prime numbers are: "); 
		for (int i = 0; i < primes.size(); i++) {
		System.out.print(primes.get(i) + "  ");
}
}
}
	
	     
