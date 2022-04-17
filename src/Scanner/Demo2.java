package Scanner;

import java.util.Scanner;
/*
 1*1=1
 1*2=2 2*2=4
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("@");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
