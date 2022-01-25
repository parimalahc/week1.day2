package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for(int i=2;i<=input/2;i++) {
			int rem = input%i;			
			if(rem==0) {
				flag=true;
				break;
			}			
		}
		
		if(flag==true) {
			System.out.println("Given number is not a prime number");
		}else
			System.out.println("Given number is a prime number");

	}

}
