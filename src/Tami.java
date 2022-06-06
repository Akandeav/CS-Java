import java.util.Scanner;
public  class Tami {
    public static void main (String[] args){
        Scanner open = new Scanner(System.in);
        int n = open.nextInt();
        open.close();
        if (n == 0 || n < 0){
            System.out.println(0);
        }
        else if (n == 1){
            System.out.println(1);
        }
        else{
            long prev = 0;
            long next = 1;
            System.out.println(prev);
            System.out.println(next);
            for (int i = 1; i <= n; i++){
                long sum = prev + next;
                System.out.println(sum);
                prev = next;
                next = sum; 
            }
        }
    }
    
}
