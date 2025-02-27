
public class Euler {
	public static void main(String[] args) {
		if (args[0].equals("1")) one();
		if (args[0].equals("2")) two();
		if (args[0].equals("3")) three();
		if (args[0].equals("4")) four();
		if (args[0].equals("5")) five();
		if (args[0].equals("6")) six();
		if (args[0].equals("7")) seven();
	}

	public static void seven() {
		int primeCount = 0;
		//int[] primeList = new int[10001];
		for (int i = 2; primeCount <= 10001; i++) {
			if (isPrime(i)) {
				primeCount++;
				if (primeCount == 10001) {
					System.out.println(i);
				}
			}
		}
		
	}



	public static void six() {
		// sum of the squares
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += Math.pow(i,2);
		}
		
		// square of the sums
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum2 += i;
		}
		sum2 = (int)Math.pow(sum2,2);
		
		// difference
		System.out.println(sum1-sum2);
		
	}

	public static void five() {
		int total = 1;
		for (int i = 1; i <=20; i++) {
			if (total % i != 0) {
				for (int j = 1; j < i; j++) {
					if (total % j == 0 && i % j == 0) {
						total = total/j;
					}
				}
				total = total * i;
			}
		}
		
		System.out.println(total);
	}
	
	public static void four() {
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 900; j--) {
				int possible = i * j;
				if(isPalendrome(possible)) {
					System.out.println(possible);
					return;
				}
			}
		}
		
	}
	
	public static void three() {
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
	
	public static void two() {
		
		int sum = 0;
		int prev = 0;
		int num = 1;
		
		while (num < 4000000) {
			int temp = num;
			num = prev + num;
			prev = temp;
			
			if (num % 2 == 0) sum += num;
		}
		
		System.out.println(sum);
	}
	
	public static void one() {

		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
	
	
	
	public static boolean isPrime(int num) {
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num%j==0) return false;
		}
		return true;
	}
	
	public static boolean isPalendrome(int num) {
		String number = String.valueOf(num);
		int count = 0;
		while (count < number.length()) {
			if (number.charAt(count) != number.charAt(number.length()-1-count)) {
				return false;
			}
			count++;
		}
		return true;
	}
}