package multidarray;

import java.util.*;

public class search {
    public static boolean check(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println(row + "," + col);
                return true;
            } else if (key > arr[row][col]) {
                row++;

            } else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 38 }, { 32, 33, 39, 50 } };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(check(arr, key));
    }
}
