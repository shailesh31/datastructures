package codingSession;

public class StarPattern {

	public static void main(String[] args) {
		
	printPattern(9);

	}
	
	public static  void printPattern(int n) {
		
		//for outer loop
		for(int i=1;i<=n;i++) {
			//for inner loop for columns/stars
			for(int j =1;j<=i;j++){
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
	}

}
