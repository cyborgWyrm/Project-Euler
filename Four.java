
public class Four {
	public static void main(String[] args) {
		
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 900; j--) {
				int possible = i * j;
				if(isPalendrome(possible)) {
					System.out.println(possible);
				}
			}
		}
		
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