package Loop;
import java.util.Scanner;
public class W12_02_SumNumber {
    public static void main(String[] args) {
        //ใช้ do while 
        Scanner kb = new Scanner(System.in);

        int start, stop;
        do{
            System.out.print("Enter a Start number:");
            start = kb.nextInt();
            System.out.print("Enter a stop number:");
            stop = kb.nextInt();
        }while(start >= stop);

            int sum = 0; //ตัวแปรสำหรับเก็บผลรวม
            int count =1;

            if(start < stop){
                for (int i = start; i <= stop;i++) {
                    System.out.println("รอบที่" +" "+ count + ":"  + sum + " + " + i + " = " +(sum+=i));
                    count++;
            }
        }else{
            System.out.println("Start number must be less than Stop number");
            }
        } 
    }
    


    

