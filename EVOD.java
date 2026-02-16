import java.util.Scanner;

public class EVOD {
    public static void main(String[] args) {
        System.out.print("the number is :" );
        Scanner sc  = new Scanner(System.in);
        int  num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("the given number is even:");

        }
        else{
            System.out.println("the given number is odd..");
        }
        
    }
}
