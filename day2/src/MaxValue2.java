import java.util.Scanner;

public class MaxValue2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("<< 3개의 정수값을 입력받아 최대값 구하기 >>");
        System.out.println("정수1 : ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("정수2 : ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("정수3 : ");
        int z = Integer.parseInt(scanner.nextLine());

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
