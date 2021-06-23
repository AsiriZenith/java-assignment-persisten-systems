/**
 * Question10
 */
public class Question10 {
    public static void displayMultiplicationMatrix() {
		int matrixSize = 13;
		int matrix[][] = new int [matrixSize][matrixSize];
		
		for(int i=1; i<matrixSize; i++) {
			matrix[i][0] = i;
			 for(int j = 1; j <matrixSize; j++) {
				 matrix[0][j] = j;
				 matrix[i][j] = i*j;
			 }
		}
		
		System.out.println("Multiplication table");
		
		for(int i=0; i<matrixSize; i++) {
			
			 for(int j = 0; j <matrixSize; j++) {
				 int num = matrix[i][j];
				 
				 String value = String.valueOf(num);
				 if (i==0 && j==0) value = " ";

				 System.out.format("%3s ",value);
			 }
			 System.out.println("");
		}
		
	}
    public static void main(String[] args) {
        displayMultiplicationMatrix();
    }
}
