 import java.util.Scanner;
 public class VC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a char as a input ");
        char ch = sc.next().charAt(0);
        
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("this is a vowel");
        }
        else if(ch >= 'a'  && ch <= 'z'){
                   System.out.println("char is consonent");
        }
        else{
            System.out.println("this is not a charecter");
        }

    }
}
