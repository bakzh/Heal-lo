public class HackJum2 {
    public static void main(String[] args) {
        int 국어 = 78;
        int 영어 = 65;
        int 수학 = 60;

        int sum = 0;
        double average = 0.0;

        sum = total(국어, 영어, 수학);
        average = getaverage(sum,3);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);

        System.out.println(total(1,2,3));
        System.out.println(getaverage(100,10));
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
