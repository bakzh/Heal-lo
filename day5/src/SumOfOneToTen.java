public class SumOfOneToTen {
    public static void main(String[] args) {
        final int NUMBER = 100;
        System.out.println("[for문] 1~" + NUMBER + "10까지의 합 = " + for1(NUMBER));
        System.out.println("[while문] 1~" + NUMBER + "10합 = " + while1(NUMBER));
        System.out.println("[do while문] 1~" + NUMBER + "10합 = " + dowhile1(NUMBER));
    }

    public static int for1(int end) {
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        return sum;

    }

    public static int while1(int end) {
        int sum = 0;
        int i = 1;
        while (i <= end) {
            sum += i;
            i++;
        }
        return sum;
    }


    public static int dowhile1(int end) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= end);
        return sum;
    }
}
