package codingSession;

public class LinearSearch {

	public static void main(String[] args) {
		 int[] numbers = {21,4,556,86,231,465,77,332,444445};
		 int target = 77;
		 boolean found =false;
		 
		 
		 for(int i=0;i<numbers.length;i++) {
			 if(numbers[i] == target) {
				 
				 System.out.println("target found at : " + i);
				 System.out.println("target found : " + numbers[i]);
				 found=true;
				 break;
				 
			 }
			 
		 }
		 if(!found) {
			 
				 System.out.println("target not found : " );
		 }
		
		 

	}


}
