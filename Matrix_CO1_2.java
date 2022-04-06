
    
 import java.util.Scanner;

public class Matrix_CO1_2
{
    private final int ARR_SIZE = 3;
private final int[][] m;
    
    public Matrix_CO1_2() {
         m = new int[ARR_SIZE][ARR_SIZE];
    }
    
    public void getdata() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.println("Enter elements of row " 
                + (i+1) + ":");
            for (int j = 0; j < ARR_SIZE; j++) {
                m[i][j] = in.nextInt();
            }
        }
    }
    
    public void rowsum() {
        for (int i = 0; i < ARR_SIZE; i++) {
            int rSum = 0;
            for (int j = 0; j < ARR_SIZE; j++) {
                rSum += m[i][j];
            }
            System.out.println("Row " + (i+1) + " sum: " + rSum);
        }
    }
    
    public void colsum() {
        for (int i = 0; i < ARR_SIZE; i++) {
            int cSum = 0;
            for (int j = 0; j < ARR_SIZE; j++) {
                cSum += m[j][i];
            }
            System.out.println("Column " + (i+1) + " sum: " + cSum);
        }
    }
    
    public static void main(String args[]) {
        Matrix_CO1_2 obj = new Matrix_CO1_2();
        obj.getdata();
        obj.rowsum();
        obj.colsum();
    }
}
