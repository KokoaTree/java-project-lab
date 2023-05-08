package week4.day1;

import java.util.Scanner;

public class MultipleToStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i * val; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
