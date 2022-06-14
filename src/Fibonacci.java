public class Fibonacci {
    
    public static void series (int n,  long sum, long prev){
        sum = 1;
        prev = 1;
        if (n <= 1){
            System.out.print(0);
        }
        else if (n == 2){
            System.out.print(1);
        }
        else if (n > 2){
            n -= 1;
            long next = prev;
            sum = prev + sum;

            System.out.println(sum);
            series(n, sum, next);
        }
    }
    public static void fib(int n){
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
    public static void main (String[] args){
        fib(50);
    }
}
