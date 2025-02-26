
public class Three {
	
	public static void main(String[] args) {
		//largest prime factor of 600851475143
		
		long bigNum = 600851475143L;
		int sqrt = (int)Math.sqrt(bigNum);
		
		for (int i = sqrt; i > 0; i--) {
			if (bigNum % i == 0) {
				// now weve found a big factor, but is it prime?
				if (isPrime(i)) {
					System.out.println(i);
					break;
				}
			}
		}
		
	}
	
	public static boolean isPrime(int num) {
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num%j==0) return false;
		}
		return true;
	}
}