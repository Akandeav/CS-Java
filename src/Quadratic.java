import java.util.Scanner;
// Akande Victor Adeola
// EU210202-2535
public class Quadratic {
    public static double[] root(double a, double b, double c){
        double n = (b * b) - (4 * a * c);
        n = Math.sqrt(n);
        double[] roots = new double[2];
        roots[0] = (-b + n) / (2 * a);
        roots[1] = (-b - n) / (2 * a);
        return roots;  
    }
    public static void main(String[] args) {
        //Create scanner Object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first value a:");
        double n1 = in.nextDouble();
        System.out.println("Enter second value b:");
        double n2 = in.nextDouble();
        System.out.println("Enter third value c:");
        double n3 = in.nextDouble();
        in.close();
        double[] ans = new double[2];
        ans = root(n1, n2, n3); 
        for (int i = 0; i < ans.length; i++){
            System.out.println("Root " + i + " = " + ans[i]);
    
        }
    }
}
