package codingSession;

public class CountEven {

	public static void main(String[] args) {
	
		int count =0;
		int[] numbers = {21,4,556,86,231,465,77,332,444445};
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i] % 2 == 0) {
				System.out.println("Even number is : "+ numbers[i]);
				count =count +1;
			}
			
		}System.out.println("Total numbers of even number are : "+ count);
		

	}

}
