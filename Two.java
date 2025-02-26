
public class Two {
	
	public static void main(String[] args) {
		
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
	
}