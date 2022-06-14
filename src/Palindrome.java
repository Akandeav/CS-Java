import java.util.Scanner;
public class Palindrome {
    public static void main (String[] args){
        Scanner word = new Scanner(System.in);
        String ch = word.next();
        word.close();
        Boolean padrm = true;
        int n = ch.length();
        for (int i = 0; i < n; i++){
            if (ch.charAt(i) != ch.charAt((n-1) - i)){
                padrm = false;
                break;
            }
        }
        if (!padrm){
            System.out.println("This is not a palidrome");
        }
        else{
            System.out.println("This is a palidrome");
        }
    }
}
