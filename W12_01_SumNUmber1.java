package Loop;
import java.util.Scanner;
public class W12_01_SumNUmber1 {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
    
        System.out.print("Enter a Start number:");
        int start = kb.nextInt();
        System.out.print("Enter a stop number:");
        int stop = kb.nextInt();
        
        while(start >= stop);
            System.out.println("Start number must be less than Stop number");
            System.out.print("Enter a Start number:");
            start = kb.nextInt();
            System.out.print("Enter a stop number:");
            stop = kb.nextInt();

            int sum = 0; //ตัวแปรสำหรับเก็บผลรวม
            int count =1;

            for (int i = start; i <= stop;i++) {
                System.out.println("รอบที่" +" "+ count + ":"  + sum + " + " + i + " = " +(sum+=i));
                count++;
            
        }

        //System.out.println("Start number must be less than Stop number.");
    }
}
