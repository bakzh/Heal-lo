import java.util.Scanner;

public class HackJum6 {
    public static void main(String[] args) {

        boolean stop = false;
        System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");

        while (!stop) {

            int 국어 = inputValue("국어");
            if (국어 == -1) {
                stop = true;
                continue;
            }
            int 영어 = inputValue("영어");
            if (영어 == -1) {
                stop = true;
                continue;
            }
            int 수학 = inputValue("수학");
            if (수학 == -1) {
                stop = true;
                continue;
            }

            int sum = 0;
            double average = 0.0;

            sum = total(국어, 영어, 수학);
            average = getaverage(sum, 3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);

        }
    }

    public static int inputValue(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title + "점수 >>");
        String input = scanner.nextLine();

        if (input.equals("Q") || input.equals("q")) {
            System.exit(1);
        }
        int score = Integer.parseInt(input);
        return score;
    }

    public static int total(int 국어, int 영어, int 수학) {
        int result = 국어 + 영어 + 수학;
        return result;
    }

    public static double getaverage(int total, int count) {
        double result = total / (double)count;
        return result;
    }
}
