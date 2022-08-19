public class MaxValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 4;

        int maxvalue = x; //최대값

//        if (x > y && x > z) {
//            maxvalue = x;
//        } else if (z > x && z > y) {
//            maxvalue = z;
//        } else if (y > z && y > x) {
//            maxvalue = y;
//        }
        if (y > maxvalue) {
            maxvalue = y;
        }
        if (z > maxvalue) {
            maxvalue = z;
        }


        System.out.print("최대값출력");
        System.out.println(maxvalue);
    }
}
