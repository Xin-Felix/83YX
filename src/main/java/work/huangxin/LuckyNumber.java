package work.huangxin;

import java.util.Scanner;

//幸运数
public class LuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int result = 0;
        for (Integer i = 1; i <= size; i++) {
            int total = 0;
            int binaryTotal = 0;
            String[] split = i.toString().split("");
            for (int j = 0; j < split.length; j++) {
                total += new Integer(split[j]);
            }

            split = Integer.toBinaryString(i).toString().split("");

            for (int j = 0; j < split.length; j++) {
                binaryTotal += new Integer(split[j]);
            }
            if (total == binaryTotal) {
                System.out.println(i);
                ++result;
            }


        }
        System.out.println(result);
    }

}
