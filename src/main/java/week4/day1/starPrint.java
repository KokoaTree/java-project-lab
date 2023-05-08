package week4.day1;

import java.util.Scanner;

public class starPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = sc.nextInt(); i > 0; i--) {
                System.out.printf("*");
        }
    }
}
