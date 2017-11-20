
public class Prime {
	
	static long maxPrime = 200_000_0000L;
	static long primeAdditional = 300_000_0000L;
	static int totalPrimes = 0;
	static boolean isPrime = true;
	
	public static void main(String[] args) {
		
		System.out.println(primes(maxPrime));

	}
	
	public static long primes(long prime) {
		int counter = 0;
		boolean[] isPrime = new boolean[(int)prime + 1];

		for (int populator = 0; populator <= prime; populator++) {
			isPrime[populator] = true;
		}

		for (int factor = 2; factor * factor <= prime; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= prime; j++) {
					isPrime[factor * j] = false;
				}
			}
		}
		
		for (int i = 1; i <= prime; i++) {
			if (isPrime[i]) counter++;
		}
		return counter - 1;
}

/*w
 * 0 - 100 = 25
 * 0 - 1000 = 168
 * 0 - 10000 = 1229
 * 0 - 100000 = 9592
 * 0 - 1000000 = 78498
 * 0 - 2000000 = 148933
 * 0 - 3000000 = 216816
*/