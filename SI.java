import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a amount which u want to invest");
    Double P = sc.nextDouble();
        System.out.println("enter a rate of interest");
        Double R  = sc.nextDouble();
        System.out.println("how much time u want interst");
        Double T = sc.nextDouble();

       Double SI = ( P * R * T)/ 100;
       System.out.println(SI);
         


    }
}
