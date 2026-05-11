import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean symmetric = true;
        for(int i = 0; i < rows; i++){
            for(int j = i + 1; j < cols; j++){
                if(matrix[i][j] != matrix[j][i]){
                    symmetric = false;
                    break;
                }
            }
        }
            if(symmetric){
                System.out.println("Symmetric");
            } else {
                System.out.println("Not Symmetric");
            }



    }
}

