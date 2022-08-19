public class HackJum {
    public static void main(String[] args) {
        int 국어 = 78;
        int 영어 = 65;
        int 수학 = 60;

        int sum = 0;
        double average = 0.0;

        sum = 국어 + 영어 + 수학;
        //case)
//        average = (double)sum / 3;
        //case2)
//          average = sum / (double)3;
        //case3)
        average = sum / (3 * 1.0);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);

    }
}
