import java.util.Scanner;

// to check if a number is prime or not
class PrimeNumber{

	static boolean isPrime(int n)
	{
		// Corner case; should not be negative
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}
	public static void main(String args[])
	{
		/* Without input taking from the user
		 * if (isPrime(10))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(25))
			System.out.println(" true");
		else
			System.out.println(" false");*/
		
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(isPrime(n)) {
			System.out.println(" true");
		} else {
			System.out.println(" false");
		}
	}
}

