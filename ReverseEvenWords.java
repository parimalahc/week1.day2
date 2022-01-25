package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] testArr=test.split(" ");
		for(int i=0;i<testArr.length;i++) {
		if(i%2!=0) {			
			char[] testArr1 = testArr[i].toCharArray();			
			for(int j=testArr1.length-1;j>=0;j--) {
				System.out.print(testArr1[j]);
			}
		}else{
			System.out.print(" "+testArr[i]+" ");
		}
		}
		
		

	}

}
