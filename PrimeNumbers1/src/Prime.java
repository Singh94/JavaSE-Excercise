
public class Prime {
	
	static int maxPrime = 3000_000;
	
	public static void main(String[] args) {
		
		//System.out.println(primes(maxPrime));
		System.out.println(primesAdvanced(maxPrime));

	}
	
	public static int primes(int prime) {
		int totalPrimes = 0;
		boolean isPrime = true;
		
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
	
	public static int primesAdvanced(int prime) {
		int counter = 0;
		boolean[] isPrime = new boolean[prime + 1];

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