public class HackJum {
    public static void main(String[] args) {
        //case1)
        /*        int[] subject = new int[3];

        subject[0] = 78; //국어점수
        subject[1] = 65; //영어점수
        subject[2] = 60; //수학점수*/

        //case2)
//        int[] subject = new int[]{78, 65, 60};

        //case3)
        int [] subject = {78, 65, 60, 87};

        int sum = 0; //총점
        double average = 0.0; //평균

        //총점
        for (int i = 0; i < subject.length; i++) {
            sum += subject[i];
        }
        //평균
        average = sum / (double) subject.length;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);
    }
}
