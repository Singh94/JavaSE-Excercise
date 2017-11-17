
public class Prime {
	
	static long maxPrime = 300_000_0000L;
	static int totalPrimes = 0;
	static boolean isPrime = true;
	
	public static void main(String[] args) {
		
		System.out.println(primes(maxPrime));

	}
	
	public static int primes(long maxPrime) {
		for(int i = 2; i < maxPrime; i++) {
            isPrime = true;
            for(int j = 2; j < i ; j++) {
            	if(i % j == 0) {
            		isPrime = false;
            		break;
            	}
            }
            if(isPrime) totalPrimes++;
		}
		return totalPrimes;
	}

}

/*
 * 0 - 100 = 25
 * 0 - 1000 = 168
 * 0 - 10000 = 1229
 * 0 - 100000 = 9592
 * 0 - 1000000 = 78498
 * 0 - 2000000 = 148933
 * 0 - 3000000 = 216816
*/