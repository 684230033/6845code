import java.util.Scanner;

public class W14_01_ShowNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start;
        int end;

        // รับค่าจนกว่าถูก
        do {
            System.out.print("Enter start value: ");
            start = sc.nextInt();

            System.out.print("Enter end value: ");
            end = sc.nextInt();

            if (start >= end) {
                System.out.println("Start value must be less than end value. Please enter again.");
            }
        } while (start >= end);

        // วนลูปตรวจสอบเลขคู่/คี่
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }

        sc.close();
    }
}