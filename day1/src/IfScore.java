public class IfScore {
    public static void main(String[] args) {
        int score = 79;

        if (score < 0 || score > 100) {
            System.out.println("점수입력 오류(0~100범위의 값만 유효합니다.)");
        }


        if (score >= 90) {
            System.out.println("A학점");
        }else if (score >= 80) {
            System.out.println("B학점");
        }else if (score >= 70) {
            System.out.println("C학점");
        }else if (score >= 60) {
            System.out.println("D학점");
        }else {
            System.out.println("F학점");
        }


    }
}
