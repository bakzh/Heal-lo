import java.util.Scanner;

public class HackJum4 {
    public static void main(String[] args) {

        System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");

        int 국어 = inputValue("국어");
        int 영어 = inputValue("영어");
        int 수학 = inputValue("수학");

        int sum = 0;
        double average = 0.0;

        sum = total(국어, 영어, 수학);
        average = getaverage(sum, 3);


        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);

    }

    public static int inputValue(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title + "점수 >>");
        int score = Integer.parseInt(scanner.nextLine());
        return score;
    }

    public static int total(int 국어, int 영어, int 수학) {
        int result = 국어 + 영어 + 수학;
        return result;
    }

    public static double getaverage(int total, int count) {
        double result = total / (double) count;
        return result;
    }
}
