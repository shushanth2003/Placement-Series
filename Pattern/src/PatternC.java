import java.util.Scanner;
public class PatternC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int count=1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            count=1;
            System.out.println("");
        }
    }
}
