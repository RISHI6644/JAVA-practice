import java.util.Scanner;
public class ColumnWisePrint {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        }
}
