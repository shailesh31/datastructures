package codingSession;

public class MaxElement {

	public static void main(String[] args) {
		
		 int[] numbers  =  {1,2,3,5,6,43,345,4665,6,23,88888,986554};
		 int max = numbers[0];
		 for(int i=0;i<numbers.length;i++){
			 
			 if(numbers[i]>max) {
				 
				 max =numbers[i];
				 
			 }
			
			 
			 
		 }
		 System.out.println("max value is : "+ max);

	}

}
