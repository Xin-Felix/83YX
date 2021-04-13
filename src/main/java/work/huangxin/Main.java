package work.huangxin;

import java.util.Scanner;

//螺旋矩阵
public class Main {
    public static int array[][];
    public static int size;
    public static int value = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        array = new int[size][size];
        toRoll(size);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void toRoll(int n) {
        int count;
        if (n % 2 != 0) {
            count = n / 2 + 1;
        } else {
            count = n / 2;
        }
        for (int i = 0; i < count; i++) {
            for (int j = i; j < n - i; j++) {
                array[i][j] = value++;
            }
            for (int j = i + 1; j < n - i; j++) {
                array[j][n - i - 1] = value++;
            }
            for (int j = n - i - 2; j >= i; j--) {
                array[n - i - 1][j] = value++;
            }
            for (int j = n - i - 2; j > i; j--) {
                array[j][i] = value++;
            }
        }

    }
}
