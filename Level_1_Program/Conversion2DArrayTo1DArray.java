import java.util.Scanner;   

public class Conversion2DArrayTo1DArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();

        int [][]matrix = new int[row][column];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        int []array = new int[row * column];
        int index = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                array[index] = matrix[i][j];
                index++;
            }
        }
    }
}