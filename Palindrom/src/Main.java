
public class Main {

	static boolean isPalindrom(int number) {
		int temp = number, lastNumber, reverseNumber = 0;
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		if (number == reverseNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		if(isPalindrom(101))
			System.out.println("sayi palindrom");
		else
			System.out.println("sayi palindrom degil");
	}

}
