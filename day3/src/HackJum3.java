import java.util.Scanner;

//import java.util.Scanner;
//
//public class HackJum3 {
//    public static void main(String[] args) {
//        double 국어;
//        double 영어;
//        double 수학;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("<< 총점과 평균 구하기 >>");
//
//        국어 = scanner.nextDouble();
//
//        영어 = scanner.nextDouble();
//
//        수학 = scanner.nextDouble();
//
//        double sum = 국어 + 영어 + 수학;
//
//        double average = sum / (double) 3;
//
//        System.out.println("합계는 "+ sum +"이고 평균값은 "+ average +"입니다.");
//
//
//    }
//
//
//}
//
public class HackJum3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");
        System.out.print("국어 점수 >>");
        String input1 = scanner.nextLine();
        int 국어 = Integer.parseInt(input1);

        System.out.print("영어 점수 >>");
        String input2 = scanner.nextLine();
        int 영어 = Integer.parseInt(input2);

        System.out.print("수학 점수 >>");
        String input3 = scanner.nextLine();
        int 수학 = Integer.parseInt(input3);

        int sum = 0;
        double average = 0.0;

        sum = total(국어, 영어, 수학);
        average = getaverage(sum,3);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);

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
