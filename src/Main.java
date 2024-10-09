import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = scan.nextInt();


        int[][] matrix = genMatrix(n);

//        Вывод матрицы
        for (int[] rows : matrix) {

            for (int row : rows) {

                System.out.printf("%d ", row);

            }
            System.out.println();

        }
    }

//    Генерация матрицы
    public static int[][] genMatrix(int n){

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length; j++){

                if (j == i){

                    arr[i][j] = 2;

                } else if (j < i) {

                    arr[i][j] = 0;

                }else {

                    arr[i][j] = 1;

                }

            }

        }

        return arr;

    }
}