import java.util.Scanner;

public class no {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

 System.out.println("th table of " +num + " is: ");
        for(int i = 1; i<=20; i++){
            int result = num * i;
            // System.out.println("th table of " +num + " is: ");
           
            System.out.println(result);
        }




        }
}
