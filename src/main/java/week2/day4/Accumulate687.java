package week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num: %d, answer: %d\n", num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num: %d, answer: %d\n", num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num: %d, answer: %d\n", num, answer);

    }
}
