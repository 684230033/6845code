package Arrays;

public class W13_02_basicArray {
    public static void main(String[] args) {
    //การประกาศตัวแปร Array แบบที่ 1 ระบุสมาชิก(เหมาะสำหรับเรารู้ค่าที่แน่นอนแล้ว)
    String animals [] = {"dog", "cat", "Lion"};
    int dice [] = {1, 2, 3, 4, 5, 6,};
    float avgScore[] = {3.50f, 4.00f, 3.98f };

    
    System.out.println("Animal at index 0 : " + animals[0]);
    System.out.println("Animal at index 2 : " + animals[2]);
    
    //การประกาศตัวแปร Array แบบที่ 2 ระบุขนาดของ Array 
    String colors[] = new String[4];
    colors[2] = "Red";
    colors[0] = "Green";
    colors[3] = "Blue";
    
    //หาขนาดของ Array
    System.out.println("Size of colord array : " + colors.length);
    
    //วนลูปสมาชิกใน Array avgScore
    System.out.println("Show all average score : ");
    for(int i=0; i < avgScore.length;i++ ){
        System.out.println(avgScore[i]);
    }
    
    //การเข้าถึงสมาชิกใน Array avgScore
    
    System.out.println("Color at index 0 : " +colors[0]);
    System.out.println("Color at index 0 : " +colors[1]);
    System.out.println("Show all colors : ");
    int j = 1;
    for(int i=0; i < colors.length;i++ ){
        System.out.println("Block " + j  + " : " +colors[i]);
        j++;
    }
    int scores[] = new int[5];
    scores[0] = 50;

    System.out.println("Score at index 4 : " + scores[4]);
    }
}
