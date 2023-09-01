import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int B=sc.nextInt();
    int H=sc.nextInt();
    try{
        if(H > 0 && B > 0){
            System.out.println(H * B);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
