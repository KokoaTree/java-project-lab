package week4.day1;

public class RightTrigangleStar {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 1; i <= height; i++) {
//            System.out.println("*".repeat(i));
            for(int j = 0; j < i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
