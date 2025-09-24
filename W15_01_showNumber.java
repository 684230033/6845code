package Arrays;

public class W15_01_showNumber {
    public static void main(String[] args) {
        int num[] = new int [100]; 
        for(int i=0 ;i<num.length ;i++ ){
        num[i] = i+24;
        System.out.println("num at end position = " +num[99]);
        int x = num[49];

        System.out.println("============================");
        System.out.println("num at index = " +num[99]);
        System.out.println("num at No.50 = " +x);
        }
    }
}

