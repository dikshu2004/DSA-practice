import java.util.Scanner;

public class DIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("the number is divisible by 5 and 11");
        }
        else{
            System.out.println("the number is not divisible by 5 and 11");
        }

        }}