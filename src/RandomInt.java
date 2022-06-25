import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random random = new Random(12);
        for (int i = 0; i < 10; i++){
            int x = (int)(Math.random()*(300-200+1)+200);  
            System.out.println(x);
        }
    }
}
