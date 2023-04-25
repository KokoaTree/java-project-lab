package week2.day2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        System.out.printf("%s, %s, %s, %s, %s, %s\n", strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        System.out.println(strArr[5]);

    }
}
