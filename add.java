import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("num1 is = ");
        int num1 =  sc.nextInt();
        System.out.println("num2 is = ");
        int num2 = sc.nextInt();
       int Sum = num1+ num2;
       System.out.println("the addition of two numbers: " + Sum);
       
    }
}
