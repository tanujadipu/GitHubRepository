package main;

public class TestPrimeNumber {

	public static void main(String[] args) {
		int i = 10;
		int counter = 0;
		for(int j = 2 ; j<=i-1 ;j++) {
			if(i%j == 0) {
				counter = counter + 1;
			}
		}
		if(counter == 0) {
			System.out.println(i+ " : is a prime number ");
		}
		else {
			System.out.println(i+ " : is not a prime number ");
		}
		

	}

}
