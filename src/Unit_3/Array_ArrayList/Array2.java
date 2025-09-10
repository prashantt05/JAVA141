package Unit_3.Array_ArrayList;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][3];
        int arr2[][] = new int[2][3];
        for(int i = 0; i< arr1.length; i++){
            for(int j = 0; j< arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< arr2.length; i++){
            for(int j = 0; j< arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int sum[][] = new int[2][3];

        for(int i = 0; i< arr1.length; i++){
            for(int j = 0; j< arr1[i].length; j++){
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        for(int i = 0; i< sum.length; i++){
            for(int j = 0; j< sum[i].length; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
