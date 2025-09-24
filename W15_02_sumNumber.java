package Arrays;
import java.util.Scanner;
public class W15_02_sumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a [] = new double[5];
        
        for (int i = 0; i < a.length; i++){
            System.out.println(" Enter Number " + (i+1) + " : ");
            a[i] = kb.nextDouble();
        }
            double sumAll = 0;
            double sumOdd = 0;
            double sumEven = 0;
            double avg = 0;
            double max = 0; 
            double min = 0;
            //Show all number
            System.out.println(" Show all number : ");
            for (int i = 0; i<  a.length; i++ ){
                System.out.println("index [" + i +"] value = " + a[i]);
                sumAll += a[i];
                
                if (a[i] % 2 != 0) {
                    sumOdd += a[i];
                } else {
                    sumEven += a[i];
                }
                if(a[i] > max){
                    max = a[i];
                }
                
                if(a[i] < min){
                    min = a[i];
                }
        
        System.out.println("Sum of all numbers = " + sumAll);
        System.out.println("Sum of all numbers = " + sumOdd);
        System.out.println("Sum of all numbers = " + sumEven);
        System.out.println("Max Number =" + max);
        System.out.println("Min Number =" + min);
        
        
        avg = sumAll / a.length;
        System.out.println("Average of all number =" +avg);
        
        
        kb.close();
    }
}

